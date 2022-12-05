import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Event } from '../models/event.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export interface EventService {

  constructor(private http:HttpClient) {}

  private eventUrl = 'http://localhost:8080/event/api';

  public get() {
    return this.http.get(this.eventUrl);
  }

  public delete(event) {
    return this.http.delete(this.eventUrl + "/"+ event.id);
  }

  public create(event) {
    return this.http.post(this.eventUrl, event);
  }

}
