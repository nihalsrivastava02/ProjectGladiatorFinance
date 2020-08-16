import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { ViewuserComponent } from './viewuser/viewuser.component';
import { ActivateuserComponent } from './activateuser/activateuser.component';
import { ProductComponent } from './product/product.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'viewuser', component: ViewuserComponent},
  {path: 'activateuser', component: ActivateuserComponent},
  {path: 'product', component: ProductComponent},
  {path: '**', component: HomeComponent},
  {path: '**', component: HomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
