import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemDisplayComponent } from './emart/item/item-display/item-display.component';
import { ItemListComponent } from './emart/item/item-list/item-list.component';
import { CartListComponent } from './emart/cart/cart-list/cart-list.component';
import { BillViewComponent } from './emart/bill/bill-view/bill-view.component';
import { BillListComponent } from './emart/bill/bill-list/bill-list.component';
import { LoginComponent } from './emart/signup/login/login.component';
import { LogoutComponent } from './emart/signup/logout/logout.component';

const routes: Routes = [
                        {
                            path: '',
                              component:LoginComponent
                        },
                        {
                          path: 'item-display/:iId',
                          component: ItemDisplayComponent
                        },
                        {
                          path: 'item-list',
                          component: ItemListComponent
                        },
                        {
                          path: 'cart-list',
                          component: CartListComponent
                        },
                        {
                          path: 'bill-view',
                          component: BillViewComponent
                        },
                        {
                          path: 'bill-list',
                          component: BillListComponent
                        },
                        {
                          path: 'logout',
                          component: LogoutComponent
                        }
                        ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
