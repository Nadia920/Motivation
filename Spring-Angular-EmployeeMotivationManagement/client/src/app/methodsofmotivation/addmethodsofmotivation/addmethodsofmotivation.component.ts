import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { MethodOfMotivationInvolved} from '..//models/user.model';
import { MethodOfMotivationInvolvedService } from './user.service';

@Component({
  selector: 'app-addmethodsofmotivation',
  templateUrl: './addmethodsofmotivation.component.html',
  styleUrls: ['./addmethodsofmotivation.component.scss']
})
export class AddMethodsOfMotivationComponent {

   methodOfMotivationInvolved: MethodOfMotivationInvolved = new MethodOfMotivationInvolved();

   constructor(private router: Router, private methodOfMotivationInvolvedService: MethodOfMotivationInvolvedService) {

   }

   createUser(): void {
     this.methodOfMotivationInvolvedService.createUser(this.methodOfMotivationInvolved)
         .subscribe( data => {
           alert("User created successfully.");
         });

   };
}
