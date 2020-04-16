import { Component, OnInit } from '@angular/core';
import { Emp } from '../emp';
import { Dept } from '../dept';
import { EmpService } from '../emp.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-editemp',
  templateUrl: './editemp.component.html',
  styleUrls: ['./editemp.component.css']
})
export class EditempComponent implements OnInit {
  emp:Emp;
  msg:string;
  depts:Dept[]=[];
  constructor(private empService:EmpService,private route:ActivatedRoute,private router:Router) { }

  ngOnInit() {
    this.route.paramMap.subscribe(params=>{let eid:number=parseInt(params.get("id"));
  this.empService.viewbyID(eid).subscribe(data=>this.emp=data);
          });
          this.empService.viewDepts().subscribe(data=>this.depts=data);
  }

  editEmp(){
    this.empService.editEmployee(this.emp).subscribe(data=>{alert(data);this.router.navigateByUrl("/getall")});
  }

}
