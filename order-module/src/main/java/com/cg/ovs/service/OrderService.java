package com.cg.ovs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.OrderDetails;

@Service
public interface OrderService {
	/*
	 * public OrderDetails addOrder(OrderDetails order); public OrderDetails
	 * updateOrder(OrderDetails order); public void removeOrder(int orderId); public
	 * List<OrderDetails> viewOrder();
	 * 
	 * //public List<OrderDetails> viewAllOrders(Customer customer); public
	 * OrderDetails findOrder(Integer orderId);
	 */
	public OrderDetails addOrder(OrderDetails order);

	public OrderDetails getOrderByOrderId(int orderId);

}
