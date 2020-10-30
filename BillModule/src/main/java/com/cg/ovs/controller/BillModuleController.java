/**
 * 
 */
package com.cg.ovs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.CartItem;
import com.cg.ovs.service.BillingService;

/**
 * @author sohel
 *
 */
@RestController
public class BillModuleController {
	@Autowired
	BillingService service;
	
	@GetMapping(path = "/getbilldetails/orderid/{orderId}")
	public BillingDetails getBillingDetails(@PathVariable int orderId) {
		return service.getBillDetails(orderId);
	}
	
	@GetMapping(path = "/calculatebill/cartid/{cartId}")
	public double calculateBill(@PathVariable int cartId) {
		return service.calculateBillAmount(cartId);
	}
	@PutMapping(path = "/updatecart")
	public CartItem updateCart(@RequestBody CartItem cart) {
		return service.updateCart(cart);
	}
	
	@PostMapping(path = "/addbill")
	public BillingDetails addBill(@RequestBody BillingDetails bill) {
		return service.addBill(bill);
	}
	
	@GetMapping(path = "/getbillamount/{billingId}")
	public double getBillingAmountByBillingId(@PathVariable int billingId) {
		return service.getBillAmount(billingId);
	}
	
}
