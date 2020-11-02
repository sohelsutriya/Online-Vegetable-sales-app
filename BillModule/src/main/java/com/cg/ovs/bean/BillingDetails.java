/**
 * 
 */
package com.cg.ovs.bean;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author sohel
 *
 */
@Entity
public class BillingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer billingId;
	@Column
	int orderId;
	@Column
	String transactionMode;
	@Column(columnDefinition = "DATE")
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd-mm-yyyy")
	Date transactionDate;
	@Column
	TransactionStatus transactionStatus;
	// @Column
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "addressId")
	Address billingAddress;

	public BillingDetails() {
		// TODO Auto-generated constructor stub
	}

	public BillingDetails(Integer billingId, int orderId, String transactionMode, Date transactionDate,
			TransactionStatus transactionStatus, Address billingAddress) {
		super();
		this.billingId = billingId;
		this.orderId = orderId;
		this.transactionMode = transactionMode;
		this.transactionDate = transactionDate;
		this.transactionStatus = transactionStatus;
		this.billingAddress = billingAddress;
	}

	public Integer getBillingId() {
		return billingId;
	}

	public void setBillingId(Integer billingId) {
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
				+ transactionMode + ", transactionDate=" + transactionDate.toString() + ", transactionStatus=" + transactionStatus
				+ ", billingAddress=" + billingAddress + "]";
	}

}
