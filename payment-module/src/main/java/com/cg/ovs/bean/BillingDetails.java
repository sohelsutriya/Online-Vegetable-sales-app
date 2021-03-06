/**
 * 
 */
package com.cg.ovs.bean;

import java.util.Date;
import java.time.LocalDate;

/**
 * @author sohel
 *
 */
public class BillingDetails {

	int billingId;

	int orderId;

	String transactionMode;

	Date transactionDate;

	TransactionStatus transactionStatus;

	Address billingAddress;

	public BillingDetails() {
		// TODO Auto-generated constructor stub
	}

	public BillingDetails(int billingId, int orderId, String transactionMode, Date transactionDate,
			TransactionStatus transactionStatus, Address billingAddress) {
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

	public void setTransactionDate(Date localDate) {
		this.transactionDate = localDate;
	}

	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
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
				+ transactionMode + ", transactionDate=" + transactionDate.toString() + ", transactionStatus="
				+ transactionStatus + ", billingAddress=" + billingAddress + "]";
	}

}
