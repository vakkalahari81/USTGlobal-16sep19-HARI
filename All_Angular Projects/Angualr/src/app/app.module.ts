import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { componentFactoryName } from '@angular/compiler';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
/* import { RegisterPageComponent } from './register-page/register-page.component'; */
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import {HttpClientModule} from '@angular/common/http' ;
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { RegisterComponent } from './register/register.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    /* RegisterPageComponent, */
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    RegisterComponent,
    TwoWayBindingComponent,
   ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
        { path : 'home', component : HomeComponent},
        { path:  'about', component: AboutComponent},
        { path: 'help', component: HelpComponent},
        { path : 'property-binding', component : PropertyBindingComponent},
        { path: 'event-binding', component: EventBindingComponent},
        {path : 'reactive-form', component: ReactiveFormComponent},
        {path: 'comment-details', component: CommentDetailsComponent},
        {path: 'register', component: RegisterComponent},
        {path: 'twowaybinding', component :TwoWayBindingComponent}
      ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}

