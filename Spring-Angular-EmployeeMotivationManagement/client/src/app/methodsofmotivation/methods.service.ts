import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { MethodOfMotivationInvolved } from '../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class MethodOfMotivationInvolvedService {

  constructor(private http:HttpClient) {}

  private methodOfMotivationUrl = 'http://localhost:8080/motivation/api';

  public getMethodsOfMotivation() {
    return this.http.get(this.methodOfMotivationUrl);
  }

  public deleteMethodOfMotivation(methodOfMotivation) {
    return this.http.delete(this.methodOfMotivationUrl + "/"+ methodOfMotivation.id);
  }

  public createMethodOfMotivation(methodOfMotivation) {
    return this.http.post(this.methodOfMotivationUrl, methodOfMotivation);
  }

}
