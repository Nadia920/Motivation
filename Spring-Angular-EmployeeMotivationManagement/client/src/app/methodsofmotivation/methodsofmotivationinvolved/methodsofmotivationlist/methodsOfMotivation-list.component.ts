import { Component, OnInit } from '@angular/core';
import { CarService } from '../shared/car/car.service';

@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css']
})
export class MotivationListComponent implements OnInit {
  motivations: Array<any>;

  constructor(private MethodsofmotivationService: methodsofmotivationService) { }

  ngOnInit() {
    this.MethodsofmotivationService.getAll().subscribe(data => {
      this.motivations = data;
    });
  }
}
