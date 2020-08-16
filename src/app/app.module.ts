import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {MatButtonModule} from '@angular/material/button'; 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IndexComponent } from './index/index.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TopbarComponent } from './topbar/topbar.component';
import { ProductComponent } from './product/product.component';
import {MatFormFieldModule} from '@angular/material/form-field'; 
import {MatSelectModule} from '@angular/material/select';
import { DashboardComponent } from './dashboard/dashboard.component'; 
import {MatTableModule} from '@angular/material/table';
import { LoginComponent } from './login/login.component'; 
import {MatRadioModule} from '@angular/material/radio';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';

// import {MatFormFieldModule} from '@angular/material/form-field'; 

@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    TopbarComponent,
    ProductComponent,
    DashboardComponent,
    LoginComponent
  ],
  exports: [
    MatInputModule
],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatFormFieldModule,
    MatSelectModule,
    MatTableModule,
    MatRadioModule,
    MatIconModule,
    MatInputModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
