
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaderResponse, HttpErrorResponse } from '@angular/common/http';
import { Product } from '../DTO/Product.dto';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  private _tempurl =  'http://localhost:8090/';
    private _url =      'http://localhost:8090/';
  
  
    constructor(private _http : HttpClient) { }
  
    login(product : Product) : Observable<number>
    {
      this._url = this._tempurl;
      this._url += 'product';
      return this._http.post<number>(this._url,product);
    }
    

    PayNowHandler(uId: string, pId: string  )
    {
      this._url = this._tempurl;
    this._url += '/PayNow' + pId + '/' + uId ;
    return this._http.get(this._url,{responseType:'text'});
    }

    getProductById(id : number) : Observable<Product>
    {
      this._url = this._tempurl;
      this._url += 'getProductById/' + id;
      return this._http.get<Product>(this._url);
    }
}
