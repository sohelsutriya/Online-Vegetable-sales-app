/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.BillingDetails;

/**
 * @author sohel
 *
 */
@Service
public interface BillingService {
	public BillingDetails updateBill(int billId,String paymentMode);
	
	public double getBillAmount(int cartId);
}
