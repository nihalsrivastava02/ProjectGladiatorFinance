import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaderResponse, HttpErrorResponse } from '@angular/common/http';
import { Login } from '../DTO/Login.dto';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private _tempurl =  'http://localhost:8090/';
    private _url =      'http://localhost:8090/';
  
  
    constructor(private _http : HttpClient) { }
  
    login(login : Login) : Observable<number>
    {
      this._url = this._tempurl;
      this._url += 'login';
      return this._http.post<number>(this._url,login);

      console.log(" service calling....");
    }
    
}
