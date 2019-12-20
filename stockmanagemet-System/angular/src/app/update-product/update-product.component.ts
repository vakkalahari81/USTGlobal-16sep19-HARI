import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

  constructor(private service: UserService) { }

  ngOnInit() {
  }

  updateProducts(form: NgForm) {
    this.service.updateProduct(form.value).subscribe(data => {
      console.log(form.value);
     }, err => {
      console.log(err);
    }, () => {
      console.log('dataposted successfully');
    });
  }

}
