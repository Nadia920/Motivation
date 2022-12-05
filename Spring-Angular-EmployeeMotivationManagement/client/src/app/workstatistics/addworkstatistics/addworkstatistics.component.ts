import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { WorkStatistics} from '../models/workstatistics.model';
import { WorkStatisticsService } from '../workstatistics.service';

@Component({
  selector: 'app-work',
  templateUrl: './work.component.html',
  styleUrls: ['./work.component.scss']
})
export class WorkStatisticsComponent {
   workStatistics: WorkStatistics = new WorkStatistics();

   constructor(private router: Router, private workStatisticsService: WorkStatisticsService) {

   }

   create(): void {
     this.workStatisticsService.createWorkStatistics(this.workStatistics)
         .subscribe( data => {
           alert("workStatistics created successfully.");
         });

   };
}
