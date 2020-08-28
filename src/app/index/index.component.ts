import { Component, OnInit, HostListener } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {

  keyword: string;
  loginOrLogout: string;
  uId : number;
  constructor(
    private _router : Router,
    ) { }


  @HostListener("window:scroll", [])
  onWindowScroll() {
    var navbar = document.getElementById("navbar");
    var sticky = navbar.offsetTop;
    if (window.pageYOffset >= sticky) {
      navbar.classList.add("sticky")
    } else {
      navbar.classList.remove("sticky");
    }
  }

  ngOnInit(): void {
    if(parseInt(sessionStorage.getItem('user'))>0)
    {
      this.uId = parseInt(sessionStorage.getItem('user'));
      this.loginOrLogout = 'Logout';
    }
    else
    {
      this.loginOrLogout = 'Login';
    }
  }

  
  loginUser()
  {
    this._router.navigate(['/login']);
  }

  logoutUser()
  {
    alert('User Logged Out');
    sessionStorage.setItem('user',null);
    this.uId = null;
    this.ngOnInit();
    this._router.navigate(['home']);
  }

  

}
