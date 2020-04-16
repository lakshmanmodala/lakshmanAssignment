import { Component, OnInit } from '@angular/core';
import { Dept } from '../dept';
import { Emp } from '../emp';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-viewbydept',
  templateUrl: './viewbydept.component.html',
  styleUrls: ['./viewbydept.component.css']
})
export class ViewbydeptComponent implements OnInit {

  depts:Dept[]=[];
  employees:Emp[]=[];
  dname:string;
  msg:string;
  emp:Emp;
  editFlag=false;
  constructor(private empService:EmpService) { }

  ngOnInit() {
    this.empService.viewDepts().subscribe(data=>this.depts=data);
  }
  searchByDept(){
    this.empService.viewByDept(this.dname).subscribe(data=>this.employees=data);
  }
  deleteById(eid:number,dept:string){
    this.empService.deleteEmployee(eid).subscribe(data=>{this.msg=data+"For Id"+eid;
          this.empService.viewByDept(dept).subscribe(data=>this.employees=data); });
  }
  showEdit(emp:Emp){
    this.emp=emp;
    this.editFlag=true;
  }
  editEmp(){
    this.empService.editEmployee(this.emp).subscribe(data=>{this.msg=data;
           this.empService.viewByDept(this.emp.dept.deptName).subscribe(data=>this.employees=data);
           this.editFlag=false;
          });
  }

}
