/**
 * 
 */
package com.cg.ovs.bean;

import java.util.List;

import javax.persistence.OneToMany;

/**
 * @author sohel
 *
 */
public class OrderDetails {
	int orderId;
	int customerId;
	//List<Vegetable> vegetables;
	double totalAmount;
	OrderStatus status;

	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int orderId, int customerId, double totalAmount, OrderStatus status) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.totalAmount = totalAmount;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", customerId=" + customerId+ ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}

}
