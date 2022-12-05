import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Punishment } from '../../models/methodofmotivationinvolved.model';
import { MethodOfMotivationInvolvedService } from '../methodofmotivationinvolved.service';

@Component({
  selector: 'app-addpunishment',
  templateUrl: './addpunishment.component.html',
  styleUrls: ['./addpunishment.component.scss']
})
export class AddPunishmentComponent {

   punishment: Punishment = new Punishment();

   constructor(private router: Router, private punishmentService: PunishmentdService) {

   }

   create(): void {
     this.punishmentService.create(this.punishment)
         .subscribe( data => {
           alert("Punishment created successfully.");
         });

   };
}


