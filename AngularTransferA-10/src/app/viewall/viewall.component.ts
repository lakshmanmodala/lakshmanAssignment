import { Component, OnInit } from '@angular/core';
import { Account } from '../account';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-viewall',
  templateUrl: './viewall.component.html',
  styleUrls: ['./viewall.component.css']
})
export class ViewallComponent implements OnInit {
accounts:Account[]=[];
msg:string;
  constructor(private accountService:AccountService) { }

  ngOnInit() {
    this.accountService.viewAll().subscribe(data=>this.accounts=data);
  }

}
