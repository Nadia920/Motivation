import { Component } from '@angular/core';

@Component({
  selector: 'app-careerladder',
  templateUrl: './careerladder.component.html',
  styleUrls: ['./careerladder.component.scss']
})
export class CareerladderComponent implements OnInit{
     careerladders: Careerladder[];

     constructor(private router: Router, private careerladderService: CareerladderService) {

       }

     ngOnInit() {
         this.careerladderService.get()
           .subscribe( data => {
             this.events = data;
           });
       };

       delete(careerladder: Careerladder): void {
         this.careerladderService.delete(event)
           .subscribe( data => {
             this.careerladders = this.careerladders.filter(c => c !== careerladder);
           })
       };

}
