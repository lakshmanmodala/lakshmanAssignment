import { Dept } from './dept';

export class Emp {
    empId:number;
    empName:string;
    empSal:string;
    dept:Dept=new Dept();
    doj:string;
    strDoj:string;
}
