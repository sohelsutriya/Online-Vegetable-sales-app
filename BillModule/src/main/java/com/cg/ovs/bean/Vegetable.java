/**
 * 
 */
package com.cg.ovs.bean;

/**
 * @author sohel
 *
 */
public class Vegetable {
	int vegetableId;
	String vegetableName;
	String vegetableType;
	double price;
	int quantity;
	public Vegetable() {
		// TODO Auto-generated constructor stub
	}
	public Vegetable(int vegetableId, String vegetableName, String vegetableType, double price, int quantity) {
		super();
		this.vegetableId = vegetableId;
		this.vegetableName = vegetableName;
		this.vegetableType = vegetableType;
		this.price = price;
		this.quantity = quantity;
	}
	public int getVegetableId() {
		return vegetableId;
	}
	public void setVegetableId(int vegetableId) {
		this.vegetableId = vegetableId;
	}
	public String getVegetableName() {
		return vegetableName;
	}
	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}
	public String getVegetableType() {
		return vegetableType;
	}
	public void setVegetableType(String vegetableType) {
		this.vegetableType = vegetableType;
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
		return "Vegetable [vegetableId=" + vegetableId + ", vegetableName=" + vegetableName + ", vegetableType="
				+ vegetableType + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
