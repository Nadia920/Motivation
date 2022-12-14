import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { WorkStatistics } from '../models/workstatistics.model';
import { YourWorkStatisticsService } from 'yourworkstatistics.service';

@Component({
  selector: 'app-worktatistics',
  templateUrl: './yourworktatistics.component.html',
  styleUrls: ['./worktatistics.component.scss']
})
export class YourWorkStatisticsComponent implements OnInit{

   worksStatistics: WorkStatistics[];

  constructor(private router: Router, private workStatisticsService: WorkStatisticsService) {

    }

  ngOnInit() {
      this.workStatisticsService.get()
        .subscribe( data => {
          this.worksStatistics = data;
        });
    };

    deleteWorkStatistics(workStatistics: WorkStatistics): void {
      this.workStatisticsService.delete(workStatistics)
        .subscribe( data => {
          this.worksStatistics = this.worksStatistics.filter(w => w !== workStatistics);
        })
    };


}
