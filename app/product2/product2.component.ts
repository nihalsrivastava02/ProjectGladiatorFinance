
import { Component, OnInit } from '@angular/core';
import { ProductService } from '../Services/product.service';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { Product } from '../DTO/Product.dto';
import { LoginService } from '../Services/login.service';
import { Login } from '../DTO/Login.dto';
//import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-product2',
  templateUrl: './product2.component.html',
  styleUrls: ['./product2.component.css']
})
export class Product2Component implements OnInit {

  product : Product;
  option: number;
  pId;
  pID : string;
  //cId: number;
  // myform:FormGroup;
  flag:boolean = false;

  constructor
  (private _productService : ProductService,     //
    private _loginService : LoginService,         //
    private  _route : ActivatedRoute,
    private _router : Router) { }
    // this.myform= new FormGroup({
    //   option1: new FormControl(null, Validators.nullValidator)
    // });
    
    // public get option1()
    // {
    //   return this.myform.get("option1");
    // }

    ngOnInit(): void
    {

      // this.option=3;
      // this.pId= 1;

      this._route.paramMap.subscribe((params: ParamMap)=>
      {
        //this.pId = parseInt(params.get('id'));
        //this.option=3;
        //this.pId= 1;
        
        this.pId = parseInt(params.get('id'));
        this._productService.getProductById(this.pId)
        .subscribe((data: Product)=>{console.log(data);this.product=data});
      });
    }



   
    show()
    {
      console.log(this.option);
    }

    PaynowHandler( )
    {
      let uId = sessionStorage.getItem('user');
      
      this.pID="2";
      if(uId!="null")
      {
        
        this._productService.PayNowHandler(uId,this.pID)
        .subscribe(data=>
          {
            alert(data);
            this._router.navigate(['userdashboard']);
          });
        }
        else
        {
          alert("First Log In");
          this._router.navigate(['login']);
        }
      
    }
  
  }
  


//   }

// }
