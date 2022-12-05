import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { WorkStatistics } from '../models/workstatistics.model';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export interface WorkStatisticsService {

  constructor(private http:HttpClient) {}

  private workStatisticsUrl = 'http://localhost:8080/workstatistics/api';

  public get() {
    return this.http.get(this.workStatisticsUrl);
  }

  public delete(methodOfMotivation) {
    return this.http.delete(this.workStatisticsUrl + "/"+ workStatistics.id);
  }

  public add(methodOfMotivation) {
    return this.http.post(this.workStatisticsUrl, workStatistics);
  }

}
