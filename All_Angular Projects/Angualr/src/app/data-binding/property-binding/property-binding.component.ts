import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  name: string = 'hari';
  imgurl = 'https://cdn.pixabay.com/photo/2019/09/27/00/50/beach-4507253__340.jpg';
   address: string = 'vijaynagar, whitefield';
  colorName: string = 'red';
  isActive : boolean = false;
  colSpanvalue:number = 2;
  constructor() {

    setInterval(()=> {
      this.colorName = 'yellow';
      this.isActive = !this.isActive;
    }, 2000);
   }
  ngOnInit() {
}
}
