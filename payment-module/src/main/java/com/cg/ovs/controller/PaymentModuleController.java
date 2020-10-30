/**
 * 
 */
package com.cg.ovs.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.Feedback;
import com.cg.ovs.bean.OrderDetails;
import com.cg.ovs.bean.TransactionStatus;
import com.cg.ovs.service.BillingService;
import com.cg.ovs.service.CustomerService;
import com.cg.ovs.service.FeedbackService;
import com.cg.ovs.service.OrderService;

/**
 * @author sohel
 *
 */
@RestController
//@RequestMapping("/feedback")
public class PaymentModuleController {
	@Autowired
	FeedbackService service;
	@Autowired
	BillingService billService;
	@Autowired
	CustomerService customerService;
	@Autowired
	OrderService orderService;

	@GetMapping(path = "feedback/getfeedback/id/{feedbackId}")
	public Feedback getFeedbackByFeedbackId(@PathVariable int feedbackId) {
		return service.getFeedbackById(feedbackId);
	}

	@GetMapping(path = "feedback/getfeedback/customerid/{customerId}")
	public Feedback getFeedbackByCustomerId(@PathVariable int customerId) {
		return service.getFeedbackByCustomerId(customerId);
	}

	@PostMapping(path = "feedback/addfeedback")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		return service.addFeedback(feedback);
	}

	@GetMapping(path = "feedback/getallfeedbacks")
	public List<Feedback> getAllFeedbacks() {
		return service.getAllFeedbacks();
	}

	@PostMapping(path = "/bill/addbill/paymentmode/{paymentMode}")
	public BillingDetails addBill(@PathVariable String paymentMode) {
		BillingDetails bill = new BillingDetails();
		bill.setTransactionMode(paymentMode);
		bill.setTransactionDate(LocalDate.now());
		bill.setTransactionStatus(TransactionStatus.Successfull);
		return billService.addBill(bill);
	}

	@GetMapping(path = "/payment/orderid/{orderId}/authenticate/customerid/{customerId}/securityanswer/{securityAnswer}")
	public OrderDetails authenticateCustomer(@PathVariable int orderId,@PathVariable int customerId,@PathVariable String securityAnswer) {
		if(customerService.authenticateUser(customerId, securityAnswer))
			{
			return confirmOrder(orderId);
			}
		else return null;
		
	}
	
	//@PostMapping(path = "/payment/order/orderid/{orderId}")
	public OrderDetails confirmOrder(@PathVariable int orderId) {
		return orderService.updateOrderStatus(orderId);
	}
}
