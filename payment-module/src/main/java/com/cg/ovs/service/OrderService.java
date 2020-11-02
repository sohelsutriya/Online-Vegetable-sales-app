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
public interface OrderService {
	public OrderDetails updateOrderStatus(int orderId,int cartId);
}
