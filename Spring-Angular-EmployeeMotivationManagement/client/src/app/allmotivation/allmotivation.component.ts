import { Component } from '@angular/core';

@Component({
  selector: 'app-allmotivation',
  templateUrl: './allmotivation.component.html',
  styleUrls: ['./allmotivation.component.scss']
})
export class AllMotivationComponent implements OnInit{
     TypeFinMots: TypeFinancialMotivation[];
     TypeNonFinMots: TypeFinancialMotivation[];

     constructor(private router: Router, private allMotivationService:AllMotivationService) {

       }


}
