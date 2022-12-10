import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { WorkStatisticsComponent } from './workstatistics/workstatistics.component';
import { AddWorkStatisticsComponent } from './workstatistics/addworkstatistics/addworkstatistics.component';
import { MethodsOfMotivationInvolvedComponent } from './methodsofmotivation/methodsofmotivationinvolved/methodsofmotivationinvolved.component';
import { AddMethodsOfMotivationInvolvedComponent} from './methodsofmotivation/addmethodsofmotivation/addmethodsofmotivation.component';
import { PunishmentComponent } from './punishment/punishment.component';
import { AddPunishmentComponent } from './punishment/addpunishment/addpunishment.component';
import { EventComponent } from './event/event.component';
import { AddEventComponent } from './event/addevent/addevent.component';
import { LoginComponent } from './login/login.component';
import { CareerLadderComponent } from './careerladder/careerladder.component';
import { YourWorkStatisticsComponent } from './yourworkstatistics/yourworkstatistics.component';

const routes: Routes = [
  { path: '/', component: LoginComponent},
  { path: '/methodsOfMotivationInvolvedComponent', component: MethodsOfMotivationInvolvedComponent },
  { path: '/addMethodOfMotivationInvolvedComponent', component: AddMethodsOfMotivationInvolvedComponent },
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
