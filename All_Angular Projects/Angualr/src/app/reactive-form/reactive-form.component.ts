import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl, Validators} from '@angular/forms';
import { CustomValidation } from './custom.validation';
import { UserService } from '../user.service';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

get email() {

  return this.form.get('email');
}
get password() {

  return this.form.get('password');
}

  form = new FormGroup({
    email : new FormControl(' ', [Validators.required, CustomValidation.unique]),
    password: new FormControl(' ', [Validators.required, CustomValidation.unique])
  });
  constructor(public service: UserService) { }

  ngOnInit() {
  }

  loginData(form){
    console.log(form);
  }

}
