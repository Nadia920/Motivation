import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { MethodsOfMotivationInvolved} from '..//models/user.model';
import { MethodsOfMotivationInvolvedService } from './user.service';

@Component({
  selector: 'app-addmethodsofmotivation',
  templateUrl: './addmethodsofmotivation.component.html',
  styleUrls: ['./addmethodsofmotivation.component.scss']
})
export class AddmethodsofmotivationComponent {
   methodOfMotivationInvolved: MethodOfMotivationInvolved = new MethodOfMotivationInvolved();

   constructor(private router: Router, private userService: UserService) {

   }

   createUser(): void {
     this.userService.createUser(this.user)
         .subscribe( data => {
           alert("User created successfully.");
         });

   };
}
