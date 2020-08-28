import { NgModule } from '@angular/core';
import { Routes, RouterModule, Router } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { ViewuserComponent } from './viewuser/viewuser.component';
import { ActivateuserComponent } from './activateuser/activateuser.component';
import { AdminproductComponent } from './adminproduct/adminproduct.component';
import { HomeComponent } from './home/home.component';
import { LoginUserComponent } from './login/login-user.component';
import { IndexComponent } from './index/index.component';
import { MainComponent } from './main/main.component';
import { RegisterComponent } from './register/register.component';
import { Product1Component } from './product1/product1.component';
import { Product2Component } from './product2/product2.component';
import { Product3Component } from './product3/product3.component';
import { Product4Component } from './product4/product4.component';
import { Product5Component } from './product5/product5.component';
import { Product6Component } from './product6/product6.component';
import { DashboardComponent } from './dashboard/dashboard.component';

const routes: Routes = [
  {path: '', component: IndexComponent},
  {path: 'index', component: IndexComponent},
  {path: 'admin', component: AdminComponent, children:[
    {path: 'home', component: HomeComponent},
    {path: 'viewuser', component: ViewuserComponent},
    {path: 'activateuser', component: ActivateuserComponent},
    {path: 'adminproduct', component: AdminproductComponent},
  ]
  },
  {path: 'login', component: LoginUserComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'product1', component: Product1Component},
  {path: 'product2', component: Product2Component},
  {path: 'product3', component: Product3Component},
  {path: 'product4', component: Product4Component},
  {path: 'product5', component: Product5Component},
  {path: 'product6', component: Product6Component},
  {path: 'userdashboard', component: DashboardComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],

  exports: [RouterModule]
})
export class AppRoutingModule {

 }
