import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { WorkStatistics} from '../models/workstatistics.model';
import { WorkStatisticsService } from '../workstatistics.service';

@Component({
  selector: 'app-work',
  templateUrl: './addworkstatistics.component.html',
  styleUrls: ['./addworkstatistics.component.scss']
})
export class AddWorkStatisticsComponent {
   workStatistics: WorkStatistics = new WorkStatistics();

   constructor(private router: Router, private workStatisticsService: WorkStatisticsService) {

   }

   create(): void {
     this.workStatisticsService.create(this.workStatistics)
         .subscribe( data => {
           alert("workStatistics created successfully.");
         });

   };
}
