import { Component, OnInit } from '@angular/core';
import { Emp } from '../emp';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-viewall',
  templateUrl: './viewall.component.html',
  styleUrls: ['./viewall.component.css']
})
export class ViewallComponent implements OnInit {
  employees:Emp[]=[];
  msg:string;
  constructor(private empService:EmpService) { }

  ngOnInit() {
    this.empService.viewAll().subscribe(data=>this.employees=data);
  }

  deleteById(eid:number){
    this.empService.deleteEmployee(eid).subscribe(data=>{this.msg=data+"for ID"+eid;
      this.empService.viewAll().subscribe(data=>this.employees=data);});
  }
}
