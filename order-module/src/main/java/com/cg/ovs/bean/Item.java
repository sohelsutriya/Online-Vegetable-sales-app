/**
 * 
 */
package com.cg.ovs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sohel
 *
 */
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemId;
	@Column
	private int vegetableId;
	@Column
	private int cartId;
	@Column
	private int quantity;
	@Column
	private int customerId;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer itemId, int vegetableId, int cartId, int quantity, int customerId) {
		super();
		this.itemId = itemId;
		this.vegetableId = vegetableId;
		this.cartId = cartId;
		this.quantity = quantity;
		this.customerId = customerId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getVegetableId() {
		return vegetableId;
	}

	public void setVegetableId(int vegetableId) {
		this.vegetableId = vegetableId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", vegetableId=" + vegetableId + ", cartId=" + cartId + ", quantity="
				+ quantity + "]";
	}

}
