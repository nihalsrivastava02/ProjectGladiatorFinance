import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Viewuser } from './../DTO/Viewuser.dto';
import { ViewuserService } from './../Services/viewuser.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-activateuser',
  templateUrl: './activateuser.component.html',
  styleUrls: ['./activateuser.component.css']
})
export class ActivateuserComponent implements OnInit {

  users: Observable<Viewuser[]>;  

  constructor(private _viewuserService : ViewuserService,
    private _router : Router) {
    
   }

  ngOnInit(): void {this._viewuserService.viewuser().subscribe(data =>{  
    this.users =data;  
    })  
    
  }

}
