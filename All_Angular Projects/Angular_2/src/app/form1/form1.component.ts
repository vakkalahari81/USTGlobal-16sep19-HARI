import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrls: ['./form1.component.css']
})
export class Form1Component implements OnInit {

  constructor() { }
flag1() {
   console.log('java');
}
flag2() {
     console.log('Sql');
}
flag3() {
  console.log('c++');
}
  ngOnInit() {
  }

  loginData(form) {
  }

}
