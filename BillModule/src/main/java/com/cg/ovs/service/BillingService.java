/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.CartItem;
import com.cg.ovs.bean.Item;

/**
 * @author sohel
 *
 */
@Service
public interface BillingService {
	public BillingDetails getBillDetails(int orderId);
	
	public double calculateBillAmount(int cartId);
	
	public Item updateCart(Item item);
	
	public BillingDetails addBill(BillingDetails bill);
	
	public double getBillAmount(int cartId);

	//public BillingDetails updateBill(BillingDetails bill);
	
	public boolean deleteById(int billingId);
	
	public BillingDetails findByBillingId(int billingId);

	public double getBillByCustomerId(int customerId);
	
}
