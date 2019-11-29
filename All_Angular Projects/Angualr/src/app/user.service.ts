import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  firebaseUrl = 'https://ust-ty-179e5.firebaseio.com/';
  constructor(private http: HttpClient) { }

  postUser(data) {

    console.log('service', data);
    return this.http.post(`${this.firebaseUrl}/users.json `, data);
  }

getUsers() {

         return this.http.get(`${this.firebaseUrl}/users.json`).pipe(
           map(data => {
                  let newArray = [];
                  for(let key in data) {
                    newArray.push({...data[key], id:key});
                 }
                  return newArray;
           })
         );
  }
}