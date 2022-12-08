import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { WorkStatistics } from '../models/workstatistics.model';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
@Injectable()
export interface YourWorkStatisticsService {

  constructor(private http:HttpClient) {}

  private yourWorkStatisticsUrl = 'http://localhost:8080/workstatistics/api';

  public get() {
    return this.http.get(this.yourWorkStatisticUrl);
  }

  public delete(yourWorkStatistics) {
    return this.http.delete(this.yourWorkStatisticsUrl + "/"+ yourWorkStatistics.id);
  }

  public add(yourWorkStatistics) {
    return this.http.post(this.yourWorkStatisticUrl, yourWorkStatistics);
  }

}
