import { Injectable } from '@angular/core';
import {Http,Response,Headers,RequestOptions} from '@angular/http';
//import {Observable} from 'rxjs/Observable';
import { Observable, from } from 'rxjs';

import 'rxjs/Rx';
 //import 'rxjs/add/operators/map';
//import 'rxjs/add/operators/catch';
//import { catchError} from 'rxjs/operators';
 import { map } from 'rxjs/operators';
 //import { throwError} from 'rxjs';
// import 'rxjs/observable/throw';
import 'rxjs/add/observable/throw';
//import { catch } from 'rxjs/operators';
//import {Observable} from 'rxjs/Rx';

import {User} from '../user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseUrl:string='http://localhost:8080/shop';
  private headers=new Headers({'Content-Type':'application/json'});
  private options=new RequestOptions({headers:this.headers});
  private user:User;
  constructor(private _http:Http) { }

  getUsers(){
    return this._http.get(this.baseUrl+'/users',this.options).pipe(map((response:Response)=>response.json())).catch(this.errorHandelar);
    
  }

  getUser(userId:string){
    return this._http.get(this.baseUrl+'/user/'+userId,this.options).pipe(map((response:Response)=>response.json())).catch(this.errorHandelar);
    
  }

  deleteUser(userId:string){
    return this._http.delete(this.baseUrl+'/user/'+userId,this.options).pipe(map((response:Response)=>response.json())).catch(this.errorHandelar);
    
  }

  createUser(user:User){
    return this._http.post(this.baseUrl+'/createUser',JSON.stringify(user), this.options).pipe(map((response:Response)=>response.json())).catch(this.errorHandelar);
    
  }

  updateUser(user:User){
    return this._http.put(this.baseUrl+'/updateUser',JSON.stringify(user), this.options).pipe(map((response:Response)=>response.json())).catch(this.errorHandelar);
    
  }
  errorHandelar(error:Response){
    return Observable.throw(error||"SERVER ERROR");
  }

  setter(user:User){
    this.user=user;
  }
  getter(){
    return this.user;
  }

}
