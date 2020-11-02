/**
 * 
 */
package com.cg.ovs.controller;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
//@RequestMapping("/payment")
public class PaymentModuleController {
	@Autowired
	FeedbackService service;
	@Autowired
	BillingService billService;
	@Autowired
	CustomerService customerService;
	@Autowired
	OrderService orderService;

	// logger
	private static final Logger logger = LoggerFactory.getLogger(PaymentModuleController.class);

	@GetMapping(path = "/feedback/getfeedback/id/{feedbackId}")
	public Feedback getFeedbackByFeedbackId(@PathVariable int feedbackId) {
		logger.info("Inside getFeedbackByFeedbackId() method of PaymentModuleController");
		return service.getFeedbackById(feedbackId);
	}

	@GetMapping(path = "/feedback/getfeedback/customerid/{customerId}")
	public Feedback getFeedbackByCustomerId(@PathVariable int customerId) {
		logger.info("Inside getFeedbackByCustomerId() method of PaymentModuleController");
		return service.getFeedbackByCustomerId(customerId);
	}

	@PostMapping(path = "/feedback/addfeedback")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		logger.info("Inside addFeedback() method of PaymentModuleController");
		return service.addFeedback(feedback);
	}

	@GetMapping(path = "/feedback/getallfeedbacks")
	public List<Feedback> getAllFeedbacks() {
		logger.info("Inside getAllFeedback() method of PaymentModuleController");
		return service.getAllFeedbacks();
	}

	@PostMapping(path = "/bill/addbill/billid/{billId}/paymentmode/{paymentMode}")
	public BillingDetails addBill(@PathVariable int billId,@PathVariable String paymentMode) {
		return billService.updateBill(billId,paymentMode);
	}

	@GetMapping(path = "/orderid/{orderId}/cartid/{cartId}/authenticate/customerid/{customerId}/securityanswer/{securityAnswer}")
	public OrderDetails authenticateCustomer(@PathVariable int orderId,@PathVariable int cartId, @PathVariable int customerId,
			@PathVariable String securityAnswer) {
		logger.info("Inside authenticateCustomer() method of PaymentModuleController");
		if (customerService.authenticateUser(customerId, securityAnswer)) {
			System.out.println("inside if in authenticatecontroller");
			return confirmOrder(orderId, cartId);
					//confirmOrder(orderId);
		} else
			return null;

	}

	// @PostMapping(path = "/payment/order/orderid/{orderId}")
	public OrderDetails confirmOrder(int orderId,int cartId) {
		return orderService.updateOrderStatus(orderId,cartId);
	}
}
