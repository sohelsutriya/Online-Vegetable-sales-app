/**
 * 
 */
package com.cg.ovs.service;

import com.cg.ovs.bean.BillingDetails;

/**
 * @author sohel
 *
 */
public interface BillingService {
	public BillingDetails getBillDetails(int orderId);
	
	public double calculateBillAmount(int cartId);
}
