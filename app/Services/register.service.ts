import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaderResponse, HttpErrorResponse } from '@angular/common/http';
import { Register } from '../DTO/Register.dto';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  private _tempurl =  'http://localhost:8090/';
    private _url =      'http://localhost:8090/';
  
  
    constructor(private _http : HttpClient) { }

  

  addNewUser(newUser: Register)
  {
    this._url = this._tempurl;
    this._url += 'register';
    return this._http.post(this._url,newUser);
  }

}
