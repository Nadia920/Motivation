import { Component } from '@angular/core';

@Component({
  selector: 'app-methodsofmotivation',
  templateUrl: './methodsofmotivation.component.html',
  styleUrls: ['./methodsofmotivation.component.scss']
})
export class MethodsofmotivationService {
   constructor(private http: HttpClient) {
   }

   getAll(): Observable<any> {
     return this.http.get('//localhost:8080/methodsMotivation');
   }
}
