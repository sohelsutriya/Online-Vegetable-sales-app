/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.CartItem;

/**
 * @author sohel
 *
 */
@Service
public interface BillingService {
	public BillingDetails getBillDetails(int orderId);
	
	public double calculateBillAmount(int cartId);
	
	public CartItem updateCart(CartItem cart);
	
	public BillingDetails addBill(BillingDetails bill);
	
	public double getBillAmount(int billingId);
	
}
