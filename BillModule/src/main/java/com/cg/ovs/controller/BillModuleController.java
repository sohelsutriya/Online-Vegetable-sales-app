/**
 * 
 */
package com.cg.ovs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.CartItem;
import com.cg.ovs.bean.Item;
import com.cg.ovs.service.BillingService;

/**
 * @author sohel
 *
 */
@RestController
public class BillModuleController {
	@Autowired
	BillingService service;
	// logger
	private static final Logger logger = LoggerFactory.getLogger(BillModuleController.class);

	@GetMapping(path = "/getbilldetails/orderid/{orderId}")
	public BillingDetails getBillingDetails(@PathVariable int orderId) {
		logger.info("Inside getBillDetails() method of BillModuleController");
		return service.getBillDetails(orderId);
	}

	@GetMapping(path = "/calculatebill/cartid/{cartId}")
	public double calculateBill(@PathVariable int cartId) {
		logger.info("Inside calculateBill() method of BillModuleController");
		return service.calculateBillAmount(cartId);
	}

	@PostMapping(path = "/updatecart")
	public Item updateCart(@RequestBody Item item) {
		logger.info("Inside updateCart() method of BillModuleController");
		return service.updateCart(item);
	}

	@PostMapping(path = "/addbill")
	public BillingDetails addBill(@RequestBody BillingDetails bill/* @RequestBody Address address */) {
		logger.info("Inside addBill() method of BillModuleController");
		// return service.addBill(bill,address);
		return service.addBill(bill);
	}

	@GetMapping(path = "/getbillamount/{cartId}")
	public double getBillingAmountByCartId(@PathVariable int cartId) {
		logger.info("Inside getBillingAmountByCartId() method of BillModuleController");
		return service.getBillAmount(cartId);
	}
	/*
	 * @PostMapping(path = "/bill/addaddress") public Address
	 * addAddress(@RequestBody Address address) {
	 * 
	 * }
	 */

	@PutMapping(path = "/updatebill")
	public BillingDetails updateBill(@RequestBody BillingDetails bill) {
		BillingDetails tempBill = service.findByBillingId(bill.getBillingId());
		tempBill.setTransactionDate(bill.getTransactionDate());
		tempBill.setTransactionMode(bill.getTransactionMode());
		tempBill.setTransactionStatus(bill.getTransactionStatus());
		
		// if(service.deleteById(tempBill.getBillingId())) return
		 return service.addBill(tempBill); //else return null;
		 
		//return service.updateBill(tempBill);
	}
	@GetMapping(path = "/getAmountByCustomerId/{customerId}")
	public double getAmountByCustomerId(@PathVariable int customerId) {
		return service.getBillByCustomerId(customerId);
	}

}
