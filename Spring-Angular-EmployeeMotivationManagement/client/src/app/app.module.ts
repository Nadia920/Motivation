import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MethodOfMotivationInvolvedComponent } from './methodsofmotivation/methodsofmotivationinvolved/methodsofmotivation.component';
import { AddMethodOfMotivationInvolvedComponent} from './methodsofmotivation/addmethodsofmotivationinvolved/addmethodsofmotivation.component';
import { MethodOfMotivationInvolvedService } from './methodsofmotivation/methodsofmotivationinvolved.service';
import { HttpClientModule } from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    MethodOfMotivationInvolvedComponent,
    AddMethodOfMotivationInvolvedComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
  MethodOfMotivationInvolvedService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
