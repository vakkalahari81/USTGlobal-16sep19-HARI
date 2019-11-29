import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  constructor() { }

  Cars = [
            {
              name: 'Maruthi',
              imgUrl: 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
            },
            {
              name: 'Suzuki',
              imgUrl: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
            },
            {
              name: 'Lamborghini',
              imgUrl: 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
            },
            {
              name: 'BMW',
              imgUrl: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
            },
            {
              name: 'Lamborghini Aventador',
              imgUrl: 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg'
            }
  ];

  selectedcar;
  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedcar = car;
  }

}
