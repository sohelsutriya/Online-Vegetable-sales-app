/**
 * 
 */
package com.cg.ovs.bean;

import java.sql.Date;

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
public class BillingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int billingId;
	@Column
	int orderId;
	@Column
	String transactionMode;
	@Column
	Date transactionDate;
	@Column
	String transactionStatus;
	@Column
	Address billingAddress;

	public BillingDetails() {
		// TODO Auto-generated constructor stub
	}

	public BillingDetails(int billingId, int orderId, String transactionMode, Date transactionDate,
			String transactionStatus, Address billingAddress) {
		super();
		this.billingId = billingId;
		this.orderId = orderId;
		this.transactionMode = transactionMode;
		this.transactionDate = transactionDate;
		this.transactionStatus = transactionStatus;
		this.billingAddress = billingAddress;
	}

	public int getBillingId() {
		return billingId;
	}

	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	@Override
	public String toString() {
		return "BillingDetails [billingId=" + billingId + ", orderId=" + orderId + ", transactionMode="
				+ transactionMode + ", transactionDate=" + transactionDate + ", transactionStatus=" + transactionStatus
				+ ", billingAddress=" + billingAddress + "]";
	}

}
