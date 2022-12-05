import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { MethodOfMotivationInvolved} from '../../models/methodofmotivationinvolved.model';
import { MethodOfMotivationInvolvedService } from '../methodofmotivationinvolved.service';

@Component({
  selector: 'app-addmethodsofmotivation',
  templateUrl: './addmethodsofmotivation.component.html',
  styleUrls: ['./addmethodsofmotivation.component.scss']
})
export class AddMethodsOfMotivationComponent {

   methodOfMotivationInvolved: MethodOfMotivationInvolved = new MethodOfMotivationInvolved();

   constructor(private router: Router, private methodOfMotivationInvolvedService: MethodOfMotivationInvolvedService) {

   }

   create(): void {
     this.methodOfMotivationInvolvedService.create(this.methodOfMotivationInvolved)
         .subscribe( data => {
           alert("Methods created successfully.");
         });

   };
}
