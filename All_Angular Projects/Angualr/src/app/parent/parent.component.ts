import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedcar;
Cars = [
        {
              name : 'Audi',
              imgUrl: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
        },
		
        {
          name : 'Benz',
          imgUrl: 'https://cdn.pixabay.com/photo/2017/03/05/15/29/aston-2118857__340.jpg',
        },
		
        {
         name : 'Ferrari',
         imgUrl: 'https://cdn.pixabay.com/photo/2013/07/12/12/56/ford-mustang-146580__340.png',
        },
		
        {
         name : 'maruti',
         imgurl: 'https://cdn.pixabay.com/photo/2013/07/13/11/50/auto-158795__340.png',
        }
];
  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
console.log(car);
this.selectedcar = car; 
  }

}
