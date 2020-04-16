import { Component, OnInit } from '@angular/core';
import { Emp } from '../emp';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-viewbyid',
  templateUrl: './viewbyid.component.html',
  styleUrls: ['./viewbyid.component.css']
})
export class ViewbyidComponent implements OnInit {

  emp:Emp=null;
  eid:number;
  msg:string;
  constructor(private empService:EmpService) { }

  ngOnInit() {
  }

  searchById(){
      this.empService.viewbyID(this.eid).subscribe(data=>{this.emp=data,this.msg=undefined},
       error=>{console.log(error);this.msg=error.error.message;this.emp=null} );
  }

}
