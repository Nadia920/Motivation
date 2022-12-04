import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { MethodOfMotivationInvolvedComponent } from './methodofmotivationinvolved/methodofmotivationinvolved.component';
import {AddMethodOfMotivationInvolvedComponent} from './methodofmotivationinvolved/add-methodofmotivationinvolved.component';

const routes: Routes = [
  { path: 'methodsOfMotivationInvolvedComponent', component: MethodOfMotivationInvolvedComponent },
  { path: 'addMethodOfMotivationInvolvedComponent', component: AddMethodOfMotivationInvolvedComponent }
];

@NgModule({
  imports: [
      RouterModule.forRoot(routes)
    ],
    exports: [
      RouterModule
    ],
    declarations: []
})
export class AppRoutingModule { }
