import { Pipe, PipeTransform } from '@angular/core';
import { Product } from './product';

@Pipe({
  name: 'orderby'
})
export class OrderbyPipe implements PipeTransform {

  transform(prods: Product[], field: any): any {
    prods= prods.sort((a,b)=>{
      if(a[field]>=b[field])
      return 1;
      else 
      return -1;
    });
    return prods;
  }

}
