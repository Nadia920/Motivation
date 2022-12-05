import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { MethodOfMotivationInvolved } from '../models/methodsofmotivationinvolved.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export interface MethodOfMotivationInvolvedService {

  constructor(private http:HttpClient) {}

  private methodOfMotivationUrl = 'http://localhost:8080/motivation/api';

  public get() {
    return this.http.get(this.methodOfMotivationUrl);
  }

  public delete(methodOfMotivation) {
    return this.http.delete(this.methodOfMotivationUrl + "/"+ methodOfMotivation.id);
  }

  public create(methodOfMotivation) {
    return this.http.post(this.methodOfMotivationUrl, methodOfMotivation);
  }

}
