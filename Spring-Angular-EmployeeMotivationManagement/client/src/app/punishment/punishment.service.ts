import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Punishment } from '../models/punishment.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export interface PunishmentService {

  constructor(private http:HttpClient) {}

  private punishmentUrl = 'http://localhost:8080/punishment/api';

  public get() {
    return this.http.get(this.punishmentUrl);
  }

  public delete(punishment) {
    return this.http.delete(this.punishmentUrl + "/"+ punishment.id);
  }

  public create(methodOfMotivation) {
    return this.http.post(this.punishmentUrl, punishment);
  }

}
