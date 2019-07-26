import { Component, OnInit } from '@angular/core';
import {User} from '../../user';
import { from } from 'rxjs';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  private user:User;
  

  constructor() { }

  ngOnInit() {
  }

}
