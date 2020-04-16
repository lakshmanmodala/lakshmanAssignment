import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewallComponent } from './viewall/viewall.component';
import { AddaccountComponent } from './addaccount/addaccount.component';
import { TransferComponent } from './transfer/transfer.component';

const routes: Routes = [
{path:'getall',   component:ViewallComponent},
{path:'addaccount',   component:AddaccountComponent},
{path:'transferaccount',   component:TransferComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
