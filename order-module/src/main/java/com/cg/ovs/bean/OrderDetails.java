/**
 * 
 */
package com.cg.ovs.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author sohel
 *
 */
@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer orderId;
	@Column
	int customerId;
	/*
	 * //@OneToMany(targetEntity = Vegetable.class, cascade =
	 * CascadeType.ALL,fetch=FetchType.EAGER)
	 * 
	 * @OneToMany(cascade={CascadeType.ALL})
	 * 
	 * @JoinColumn(name="vegetableId", referencedColumnName="vegetableId")
	 * //@JoinColumn(name="vegetableId") List<Vegetable> vegetables;
	 */
	@Column
	double totalAmount;
	@Column
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

	/*
	 * public List<Vegetable> getVegetables() { return vegetables; }
	 * 
	 * public void setVegetables(List<Vegetable> vegetables) { this.vegetables =
	 * vegetables; }
	 */

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
		return "OrderDetails [orderId=" + orderId + ", customerId=" + customerId
				+ ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}

}
