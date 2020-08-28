import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Viewuser } from './../DTO/Viewuser.dto';
import { ViewuserService } from './../Services/viewuser.service';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-viewuser',
  templateUrl: './viewuser.component.html',
  styleUrls: ['./viewuser.component.css']
})
export class ViewuserComponent implements OnInit {

  users: Observable<Viewuser[]>;  

  constructor(private _viewuserService : ViewuserService,
    private _router : Router) {
    
   }

  ngOnInit(): void {this._viewuserService.viewuser().subscribe(data =>{  
    this.users =data;  
    })  
    
  }


}
