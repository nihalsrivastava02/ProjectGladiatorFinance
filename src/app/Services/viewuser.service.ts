import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaderResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Viewuser } from './../DTO/Viewuser.dto';

@Injectable({
  providedIn: 'root'
})
export class ViewuserService {

  private _tempurl =  'http://localhost:8090/';
  private _url =      'http://localhost:8090/';


  constructor(private _http : HttpClient) { }

  viewuser(): Observable<any> {  
    this._url = this._tempurl;
    this._url += 'customer';
    return this._http.get<Viewuser[]>(this._url);
  }  



}
