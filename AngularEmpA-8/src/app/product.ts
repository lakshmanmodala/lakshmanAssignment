export class Product {

    pid:number;
    pname:string;
    price:number;
    cat:string;

    constructor(prodid:number,prodname:string,prodprice:number,category:string){
        this.pid=prodid;
        this.pname=prodname;
        this.price=prodprice;
        this.cat=category;
}
}
