/**
 * 
 */
package com.cg.ovs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.CartItem;
import com.cg.ovs.bean.Item;
import com.cg.ovs.bean.Vegetable;
import com.cg.ovs.repository.BillingRepository;

/**
 * @author sohel
 *
 */
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	BillingRepository repos;
	@Autowired
	RestTemplate restTemplate;

	@Override
	public BillingDetails getBillDetails(int orderId) {
		return repos.findByorderId(orderId);
	}

	@Override
	public double calculateBillAmount(int cartId) {
		// get list of vegetables from order ms by using restTemplate
		ResponseEntity<Item[]> cart = restTemplate.getForEntity("http://localhost:5060/order/cart/cartid/" + cartId,
				Item[].class);
		double temp = 0;
		for (Item item : cart.getBody()) {
			// int temp=0;
			Vegetable vegetable = restTemplate
					.getForEntity("http://localhost:5060/stock/vegetable/vegetablebyId/" + item.getVegetableId(),
							Vegetable.class)
					.getBody();
			temp = temp + (vegetable.getPrice() * item.getQuantity());
		}
		return temp;
	}

	@Override
	public Item updateCart(Item item) {
		return restTemplate.postForEntity("http://localhost:5060/order/cart/additemtocart/customerId/"
				+ item.getCustomerId() + "/cartid/" + item.getCartId() + "/vegetableid/" + item.getVegetableId()
				+ "/quantity/" + item.getQuantity(), Item.class, Item.class).getBody();
	}

	@Override
	public BillingDetails addBill(BillingDetails bill) {
		return repos.save(bill);
	}

	@Override
	public double getBillAmount(int cartId) {
		return calculateBillAmount(cartId);
	}

	// @Override
	// public BillingDetails updateBill(BillingDetails bill) {
	/*
	 * BillingDetails tempBill = repos.findById(bill.getBillingId()).get();
	 * tempBill.setTransactionDate(bill.getTransactionDate());
	 * tempBill.setTransactionMode(bill.getTransactionMode());
	 * tempBill.setTransactionStatus(bill.getTransactionStatus());
	 * repos.deleteById(tempBill.getBillingId()); return repos.save(tempBill);
	 */
	// repos.updateBillById(bill.getOrderId(),bill.getTransactionDate(),
	// bill.getTransactionMode(), bill.getTransactionStatus(), bill.getBillingId());
	// return bill;

	// }

	@Override
	public boolean deleteById(int billingId) {
		if (repos.findById(billingId) != null) {
			repos.deleteById(billingId);
			return true;
		} else
			return false;
	}

	@Override
	public BillingDetails findByBillingId(int billingId) {
		return repos.findById(billingId).get();
	}

	@Override
	public double getBillByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
