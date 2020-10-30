/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.OrderDetails;

/**
 * @author sohel
 *
 */
@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public OrderDetails updateOrderStatus(int orderId) {
		//get order details by orderId from order ms through rest template
		//set order status as confirmed if payment is successfull
		return null;
	}

}
