/**
 * 
 */
package com.cg.ovs.bean;

import java.util.List;

/**
 * @author sohel
 *
 */
public class OrderDetails {
	int orderId;
	int customerId;
	List<Vegetable> vegetables;
	double totalAmount;
	String status;

	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int orderId, int customerId, List<Vegetable> vegetables, double totalAmount, String status) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.vegetables = vegetables;
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

	public List<Vegetable> getVegetables() {
		return vegetables;
	}

	public void setVegetables(List<Vegetable> vegetables) {
		this.vegetables = vegetables;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", customerId=" + customerId + ", vegetables=" + vegetables
				+ ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}

}
