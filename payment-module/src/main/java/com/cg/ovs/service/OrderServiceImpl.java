/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.ovs.bean.OrderDetails;
import com.cg.ovs.bean.OrderStatus;

/**
 * @author sohel
 *
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	BillingService billingService;

	@Override
	public OrderDetails updateOrderStatus(int orderId,int cartId) {
		// get order details by orderId from order ms through rest template
		// set order status as confirmed if payment is successfull
		OrderDetails order = restTemplate
				.getForEntity("http://localhost:5060/order/order/getorder/orderid/" + orderId, OrderDetails.class)
				.getBody();
		order.setStatus(OrderStatus.Confirmed);
		order.setTotalAmount(billingService.getBillAmount(cartId));
		restTemplate.put("http://localhost:5060/order/order/updateorder", order);
		return order;
	}

}
