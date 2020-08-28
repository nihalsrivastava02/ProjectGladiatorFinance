import { Component, OnInit } from '@angular/core';
import { Login } from '../DTO/Login.dto';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { LoginService } from '../Services/login.service';

@Component({
  selector: 'app-login-user',
  templateUrl: './login-user.component.html',
  styleUrls: ['./login-user.component.css']
})
export class LoginUserComponent implements OnInit {

  login: Login;
  username: string = "";
  password: string = "";
  uId$ : Observable<number>;

  constructor(private _loginService : LoginService,
    private _router : Router) { }

    ngOnInit(): void {
      if(parseInt(sessionStorage.getItem('user'))>0)
      {
        alert("Already Logged In");
        this._router.navigate(['index']);
      }
    }

    loginUser()
  {

    this.login = new Login();
    this.login.username = this.username;
    this.login.password = this.password;
    this.uId$ = this._loginService.login(this.login);
    
    console.log("helloo login");
    
  }

  moveToHomePage(id)
  {
    console.log("I am here");
    if(id<0)
    {
      alert('User Not Found');
      this.uId$ = null;
      return;
    }
    sessionStorage.setItem('user',id);
    this._router.navigate(['index']);
  }


}
