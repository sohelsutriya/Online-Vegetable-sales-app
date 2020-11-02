package com.cg.ovs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.bean.OrderDetails;
import com.cg.ovs.repository.OrderDao;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		return orderDao.save(order);
	}

	@Override
	public OrderDetails getOrderByOrderId(int orderId) {
		return orderDao.findById(orderId).get();
	}
	
	/*
	 * @Override public OrderDetails addOrder(OrderDetails order) {
	 * 
	 * return this.orderDao.save(order); }
	 * 
	 * @Override public OrderDetails updateOrder(OrderDetails order) { // TODO
	 * Auto-generated method stub return this.orderDao.save(order); }
	 * 
	 * @Override public void removeOrder(int orderId) { // TODO Auto-generated
	 * method stub this.orderDao.deleteById(orderId); }
	 * 
	 * @Override public List<OrderDetails> viewOrder() { // TODO Auto-generated
	 * method stub return this.orderDao.findAll(); }
	 * 
	 * 
	 * @Override public List<OrderDetails> viewAllOrders(Customer customer) { //
	 * TODO Auto-generated method stub return this.orderDao.findAll(); }
	 * 
	 * 
	 * @Override public OrderDetails findOrder(Integer orderId) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Override public Order findOrder(Integer orderId) { // TODO Auto-generated
	 * return this.orderDao.findAll().stream().filter(x->
	 * orderId.equals(x.getOrderId())).findAny().orElse(null);
	 * 
	 * }
	 */
}