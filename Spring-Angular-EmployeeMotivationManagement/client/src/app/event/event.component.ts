import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { MethodsOfMotivationInvolved} from '../../models/methodofmotivationinvolved.model';
import { MethodsOfMotivationInvolvedService } from '../methodsofmotivationinvolved.service';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.scss']
})
export class EventComponent implements OnInit{
  events: Event[];

  constructor(private router: Router, private eventService: EventService) {

    }

  ngOnInit() {
      this.eventService.get()
        .subscribe( data => {
          this.events = data;
        });
    };

    delete(event: Event): void {
      this.eventService.delete(event)
        .subscribe( data => {
          this.events = this.events.filter(e => e !== event);
        })
    };

}
