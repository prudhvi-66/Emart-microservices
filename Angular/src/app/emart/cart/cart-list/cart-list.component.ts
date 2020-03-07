import { Component, OnInit } from '@angular/core';
import { EmartService } from '../../emart.service';
import { Cart } from '../../cart';
import { Item } from '../../item';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart-list',
  templateUrl: './cart-list.component.html',
  styleUrls: ['./cart-list.component.css']
})
export class CartListComponent implements OnInit {
  cartItems: any;
  showCart: boolean;
  currentBuyer: any;
  constructor(protected emartService: EmartService, protected router: Router) { }

  ngOnInit(): void {
    this.cartItems = this.emartService.getAllCart();
    if (this.cartItems.length == 0) {
      this.showCart = false;
    }
    else {
      this.showCart = true;
    }
  }

  deleteCartItem(itemNo: number) {
    this.cartItems = this.emartService.deleteCartItem(itemNo);
  }

  checkOut(Items: any) {
    this.emartService.setAllCart(Items);
    this.router.navigate(['bill-view']);
    console.log(Items);
  }
}
