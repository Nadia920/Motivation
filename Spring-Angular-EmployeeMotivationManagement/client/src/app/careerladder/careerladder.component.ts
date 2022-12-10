import { Component } from '@angular/core';
import { CareerLadder } from './models/careerladder.model';

@Component({
  selector: 'app-careerladder',
  templateUrl: './careerladder.component.html',
  styleUrls: ['./careerladder.component.scss']
})
export class CareerLadderComponent implements OnInit{
     careerLadders: CareerLadder[];

     constructor(private router: Router, private careerLadderService: CareerLadderService) {

       }

     ngOnInit() {
         this.careerLadderService.get()
           .subscribe( data => {
             this.events = data;
           });
       };

       delete(careerLadder: CareerLadder): void {
         this.careerLadderService.delete(event)
           .subscribe( data => {
             this.careerLadders = this.careerLadders.filter(c => c !== careerLadder);
           })
       };

}
