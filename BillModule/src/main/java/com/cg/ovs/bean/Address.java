/**
 * 
 */
package com.cg.ovs.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sohel
 *
 */
@Entity(name = "Address2")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer addressId;
	/*
	 * @OneToOne(cascade = { CascadeType.ALL })
	 * 
	 * @JoinColumn(name = "billingId")
	 */
	//int billingId;
	String area;
	String city;
	String state;
	String pinCode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String area, String city, String state, String pinCode) {
		super();
		this.area = area;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
}
