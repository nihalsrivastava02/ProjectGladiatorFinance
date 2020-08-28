import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
export interface PeriodicElement {
  product: string;
  position: number;
  date: number;
  amtpaid: number;
}
const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, product: 'Dhanush', date: 1, amtpaid: 1000},
  {position: 2, product: 'Bandd', date: 4, amtpaid: 1000},
];
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor() { }
  displayedColumns: string[] = ['position', 'product', 'date', 'amtpaid'];
  dataSource = new MatTableDataSource(ELEMENT_DATA);

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
  

  ngOnInit(): void {
  }

}
