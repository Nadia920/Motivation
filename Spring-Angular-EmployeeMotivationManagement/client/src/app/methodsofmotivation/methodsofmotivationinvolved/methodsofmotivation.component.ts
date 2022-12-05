import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { MethodsOfMotivationInvolved} from '../../models/methodofmotivationinvolved.model';
import { MethodsOfMotivationInvolvedService } from '../methodsofmotivationinvolved.service';

@Component({
  selector: 'app-methodofmotivationinvolved',
  templateUrl: './methodsofmotivationinvolved.component.html',
  styleUrls: ['./methodsofmotivationinvolved.component.scss']
})
export class MethodsofmotivationinvolvedComponent implements OnInit{

  methodsOfMotivationInvolved: MethodsOfMotivationInvolved[];

  constructor(private router: Router, private methodsOfMotivationInvolvedService: MethodsOfMotivationInvolvedService) {

    }

  ngOnInit() {
      this.methodsOfMotivationInvolvedService.get()
        .subscribe( data => {
          this.methodsOfMotivationInvolved = data;
        });
    };

    deleteUser(methodOfMotivationInvolved: MethodOfMotivationInvolved): void {
      this.methodsOfMotivationInvolvedService.delete(methodsOfMotivationInvolved)
        .subscribe( data => {
          this.methodsOfMotivationInvolved = this.methodsOfMotivationInvolved.filter(m => m !== methodOfMotivationInvolved);
        })
    };


}
