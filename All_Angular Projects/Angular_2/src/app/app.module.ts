import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CarComponent } from './car/car.component';
import { MoviesComponent } from './movies/movies.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { compileBaseDefFromMetadata } from '@angular/compiler';
import { Form1Component } from './form1/form1.component';
/* import { BikeComponent } from './bike/bike.component';
 */
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarComponent,
    MoviesComponent,
    LaptopsComponent,
    MobilesComponent,
    Form1Component,
  ],
  imports: [
    BrowserModule,
    FormModule,
   /* AppRoutingModule,  */
    RouterModule.forRoot([
      {path: 'home', component: HomeComponent},
      {path: 'car', component: CarComponent},
     /*{path: 'bike', component: BikeComponent}, */
      {path: 'movies', component: MoviesComponent},
      {path: 'laptops', component: LaptopsComponent},
      {path: 'mobiles', component: MobilesComponent},
      {path: 'form', component: Form1Component}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
