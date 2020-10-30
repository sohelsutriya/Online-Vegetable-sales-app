/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.CartItem;
import com.cg.ovs.repository.BillingRepository;

/**
 * @author sohel
 *
 */
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	BillingRepository repos;

	@Override
	public BillingDetails getBillDetails(int orderId) {
		// return billing details
		// get billing details from database
		return null;
	}

	@Override
	public double calculateBillAmount(int cartId) {
		// get list of vegetables from order ms by using restTemplate
		return 0;
	}

	@Override
	public CartItem updateCart(CartItem cart) {
		// update cart which is present in order ms
		return null;
	}

	@Override
	public BillingDetails addBill(BillingDetails bill) {
		// add bill to database
		return null;
	}

	@Override
	public double getBillAmount(int billingId) {
		// get bill amount from billingdetails by billingId
		return 0;
	}

}
