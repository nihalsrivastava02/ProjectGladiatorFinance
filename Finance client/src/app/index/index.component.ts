import { Component, OnInit, HostListener } from '@angular/core';
@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {

  constructor() { }
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

    // function on() {
    //   document.getElementById("fafafabar").style.display = "none";
    //       document.getElementById("side-container").style.display = "block";
    //       document.getElementById("side").style.display = "block";
    //       document.getElementById("roundimage").style.display = "block";
    //   }
      
    //   function off() {
    //   document.getElementById("fafafabar").style.display = "block";
    //       document.getElementById("side-container").style.display = "none";
    //       document.getElementById("roundimage").style.display = "block";
    //   }
      
  }

}
