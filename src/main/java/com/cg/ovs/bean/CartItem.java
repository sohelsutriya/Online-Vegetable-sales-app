/**
 * 
 */
package com.cg.ovs.bean;

import java.util.List;

/**
 * @author sohel
 *
 */
public class CartItem {
	int cartId;
	int customerId;
	List<Vegetable> vegetables;
	public CartItem() {
		// TODO Auto-generated constructor stub
	}
	public CartItem(int cartId, int customerId, List<Vegetable> vegetables) {
		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.vegetables = vegetables;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
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
	@Override
	public String toString() {
		return "CartItem [cartId=" + cartId + ", customerId=" + customerId + ", vegetables=" + vegetables + "]";
	}
	
}
