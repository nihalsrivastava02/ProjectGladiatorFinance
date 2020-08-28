import { Component, OnInit } from '@angular/core';
import {FormControl, Validators,} from '@angular/forms';
import { Register } from '../DTO/Register.dto';
import { Router } from '@angular/router';
import { RegisterService } from '../Services/register.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent{  

  userSignUp : Register;
  constructor(
    private _customerService : RegisterService,
    private _router : Router
  ) 
  {
    this.userSignUp = new Register();
  }

  ngOnInit(): void
  {
    if(parseInt(sessionStorage.getItem('user'))>0)
    {
      alert('Already Logged In');
      this._router.navigate(['home']);
    }
  }

  onRegisterClick()
  {
    
    this._customerService.addNewUser(this.userSignUp)
    .subscribe(data=>
      {
        if(data == -100)
        { 
          alert("User Already Registered");
        }
        else
        {
          alert("Congratulations! You are registered. Please Login :) ");
          this._router.navigate(['index']);
        }
      });

  }
  
}
