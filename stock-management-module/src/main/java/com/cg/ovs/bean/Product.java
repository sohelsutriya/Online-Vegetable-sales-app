package com.cg.ovs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodId;
	@Column
	private String name;
	@Column
	private String type;
	@Column
	private String category;
	@Column
	private double price;
	@Column
	private int quantity;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int prodId, String name, String type, String category, double price, int quantity) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.type = type;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", name=" + name + ", type=" + type + ", category=" + category + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

}
