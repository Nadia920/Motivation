import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { WorkStatisticsComponent } from './workstatistics/workstatistics.component';
import { AddWorkStatisticsComponent } from './workstatistics/addworkstatistics/addworkstatistics.component';
import { MethodOfMotivationInvolvedComponent } from './methodsofmotivation/methodsofmotivationinvolved/methodsofmotivation.component';
import { AddMethodOfMotivationInvolvedComponent} from './methodsofmotivation/addmethodsofmotivationinvolved/addmethodsofmotivation.component';
import { PunishmentComponent } from './punishment/punishment.component';
import { AddPunishmentComponent } from './punishment/addpunishment/addpunishment.component';
import { EventComponent } from './event/event.component';
import { AddEventComponent } from './event/addevent/addevent.component';

const routes: Routes = [
  { path: '/methodsOfMotivationInvolvedComponent', component: MethodOfMotivationInvolvedComponent },
  { path: '/addMethodOfMotivationInvolvedComponent', component: AddMethodOfMotivationInvolvedComponent },
  { path: '/employeePerformanceAnalysis', component: WorkStatisticsComponent },
  { path: '/addWorkStatistics', component: AddWorkStatisticsComponent },
  { path: '/punishment', component: PunishmentComponent },
  { path: '/addPunishment', component: AddPunishmentComponent },
  { path: '/event', component: EventComponent },
  { path: '/addEvent', component: AddEventComponent },
  { path: '/careerLadder', component: CareerLadderComponent },
  { path: '/yourWorkStatistics', component: YourWorkStatisticsComponent },
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
