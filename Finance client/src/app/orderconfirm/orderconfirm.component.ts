import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-orderconfirm',
  templateUrl: './orderconfirm.component.html',
  styleUrls: ['./orderconfirm.component.css']
})
export class OrderconfirmComponent implements OnInit {
  num1: number = 12500;
  id = Math.floor((Math.random() * 9999999) + 1);
  orderid = Math.floor((Math.random() * 7899999) + 1);
  datePipeString : string;

  constructor(private datePipe: DatePipe) { 
    this.datePipeString = datePipe.transform(Date.now(),'yyyy-MM-dd');
    console.log(this.datePipeString);
    //2019-07-22
  }
  ngOnInit(): void {
  }

}
