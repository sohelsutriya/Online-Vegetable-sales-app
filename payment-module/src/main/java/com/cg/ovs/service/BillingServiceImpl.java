/**
 * 
 */
package com.cg.ovs.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.TransactionStatus;

/**
 * @author sohel
 *
 */
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	RestTemplate restTemplate;

	@Override
	public BillingDetails updateBill(int billId, String paymentMode) {
		// use rest template to update bill in Billing ms
		BillingDetails bill = new BillingDetails();
		bill.setBillingId(billId);
		bill.setTransactionMode(paymentMode);
		bill.setTransactionDate(new Date());
		bill.setTransactionStatus(TransactionStatus.Successfull);
		restTemplate.put("http://localhost:5060/bill/updatebill", bill);
		return bill;
	}

	@Override
	public double getBillAmount(int cartId) {
		return restTemplate.getForEntity("http://localhost:5060/bill/getbillamount/"+cartId, double.class).getBody();
	}
	

}
