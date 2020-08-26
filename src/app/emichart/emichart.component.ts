import { Component, OnInit,ViewChild } from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatTableDataSource} from '@angular/material/table';


export interface PeriodicElement {
  dueid: number;
  purchasetxnid:number;
  duedate:String;
  paymenttobedone:number;
  initialtobebalance:number;
  afterpaymenttobebalance:number;
  installmentmonthno:number;
  status:String;
}

const ELEMENT_DATA: PeriodicElement[] = [

  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:2,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:2,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:1,	status:'complete'},
  {dueid:10410311,	purchasetxnid:141031,	duedate:"sdfs",	paymenttobedone:8333.33,	initialtobebalance:50000,	afterpaymenttobebalance:41666.77,	installmentmonthno:2,	status:'complete'},

  
];

@Component({
  selector: 'app-emichart',
  templateUrl: './emichart.component.html',
  styleUrls: ['./emichart.component.css']
})

export class EmichartComponent {
  displayedColumns: string[] = ['dueid','purchasetxnid',	'duedate',	'paymenttobedone',	'initialtobebalance',	'afterpaymenttobebalance',	'installmentmonthno',	'status'];
  dataSource = new MatTableDataSource<PeriodicElement>(ELEMENT_DATA);
  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;

  ngOnInit() {
    this.dataSource.paginator = this.paginator;
  }
}
