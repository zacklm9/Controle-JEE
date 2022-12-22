import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppComponent } from './app.component';
import {RouterOutlet} from "@angular/router";
import { ProductsComponent } from './products/products.component';
import {HttpClientModule} from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { CustomersComponent } from './customers/customers.component';

import { BillsDetailsComponent } from './bills-details/bills-details.component';
import { BillsComponent } from './bills/bills.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";

@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    CustomersComponent,
    BillsDetailsComponent,
    BillsComponent
  ],
    imports: [
      BrowserModule,
      AppRoutingModule,
      BrowserAnimationsModule,
      HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
