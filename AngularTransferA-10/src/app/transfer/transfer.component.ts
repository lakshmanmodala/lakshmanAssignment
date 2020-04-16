import { Component, OnInit } from '@angular/core';
import { Transfer } from '../transfer';
import { AccountService } from '../account.service';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';

@Component({
  selector: 'app-transfer',
  templateUrl: './transfer.component.html',
  styleUrls: ['./transfer.component.css']
})
export class TransferComponent implements OnInit {
trans:Transfer=new Transfer();
msg:string;
errorMsg:string;
  constructor(private accountService:AccountService) { }

  ngOnInit() {
  }
  transfer(){
    this.accountService.transferAccount(this.trans).subscribe(data=>{
      this.msg=data;this.trans=new Transfer();this.errorMsg=undefined},
      error=>{this.errorMsg=JSON.parse(error.error).message;console.log(error);
        this.msg=undefined});
  }

}
