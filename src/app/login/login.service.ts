import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { LoginDto } from './login.dto';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

    login(loginDto){
        const url="http://localhost:8080/login";
        const headers = new HttpHeaders({'Content-Type': 'application/json', 'Accept': 'application/json'});
        return this.http.post<LoginDto>(url, loginDto, {headers: headers});
    }

    isUserLoggedIn(id) {
      let user = sessionStorage.getItem(id)
      if (user === null) {
          return false
      }
      else{
        return true
      }
    }

    getLoggedInId() {
      let user = sessionStorage.getItem('id')
      if (user === null) {
        return ''
      }
      else{
        return user
      }
    }
}
