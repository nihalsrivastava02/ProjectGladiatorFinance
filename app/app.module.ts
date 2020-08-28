import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import {MatButtonModule} from '@angular/material/button'; 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IndexComponent } from './index/index.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TopbarComponent } from './topbar/topbar.component';

import {MatFormFieldModule} from '@angular/material/form-field'; 
import {MatSelectModule} from '@angular/material/select';
import { DashboardComponent } from './dashboard/dashboard.component'; 
import {MatTableModule} from '@angular/material/table';
import { LoginUserComponent } from './login/login-user.component'; 
import {MatRadioModule} from '@angular/material/radio';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatCardModule } from '@angular/material/card';
import { MatTabsModule } from '@angular/material/tabs';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { AdminComponent } from './admin/admin.component';
import { ViewuserComponent } from './viewuser/viewuser.component';
import { ActivateuserComponent } from './activateuser/activateuser.component';
import { AdminproductComponent } from './adminproduct/adminproduct.component';
import { HomeComponent } from './home/home.component';
import { CommonModule } from '@angular/common';
import { MainComponent } from './main/main.component';
import { RegisterComponent } from './register/register.component';
import { ReactiveFormsModule } from '@angular/forms';
import { Product1Component } from './product1/product1.component';
import { Product2Component } from './product2/product2.component';
import { Product3Component } from './product3/product3.component';
import { Product4Component } from './product4/product4.component';
import { Product5Component } from './product5/product5.component';
import { Product6Component } from './product6/product6.component';
//import { MatInputModule } from '@angular/material';
//import {MatFormFieldModule} from '@angular/material/form-field'; 

@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    TopbarComponent,
    DashboardComponent,
    LoginUserComponent,
    RegisterComponent,
    AdminComponent,
    ViewuserComponent,
    ActivateuserComponent,
    AdminproductComponent,
    HomeComponent,
    MainComponent,
    Product1Component,
    Product2Component,
    Product3Component,
    Product4Component,
    Product5Component,
    Product6Component
  ],
  exports: [
    CommonModule,
   
],
  imports: [
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    MatFormFieldModule,
    MatRadioModule,
    FormsModule,
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatFormFieldModule,
    MatSelectModule,
    MatTableModule,
    MatRadioModule,
    MatIconModule,
    MatInputModule,
    MatCardModule,
    MatTabsModule,
    MatCheckboxModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
