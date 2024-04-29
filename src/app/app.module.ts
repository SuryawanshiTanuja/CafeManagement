import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './product/product.component';
import { LoginComponent } from './login/login.component';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { BillComponent } from './bill/bill.component';
import { SignupComponent } from './signup/signup.component';
import { AboutComponent } from './about/about.component';
import { ContactusComponent } from './contactus/contactus.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';


const appRoute:Routes=[
{path:'home', component:HomeComponent},
{path:'product', component:ProductComponent},
{path:'user', component:UserComponent},
{path:'bill', component:BillComponent},
{path:'about', component:AboutComponent},
{path:'contactus', component:ContactusComponent},
{path:'login', component:LoginComponent},
{path:'signup', component:SignupComponent},
{path:'**', component:PagenotfoundComponent},
];


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    ProductComponent,
    LoginComponent,
    UserComponent,
    BillComponent,
    SignupComponent,
    AboutComponent,
    ContactusComponent,
    PagenotfoundComponent,

  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoute)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
