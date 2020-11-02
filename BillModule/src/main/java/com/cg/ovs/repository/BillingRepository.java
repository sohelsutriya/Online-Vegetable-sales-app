/**
 * 
 */
package com.cg.ovs.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.BillingDetails;
import com.cg.ovs.bean.TransactionStatus;

/**
 * @author sohel
 *
 */
@Repository
public interface BillingRepository extends JpaRepository<BillingDetails, Integer> {
	public BillingDetails findByorderId(int orderId);

	/*
	 * @Modifying
	 * 
	 * @Query("update BillingDetails bill set bill.orderId = ?1,bill.transaction_date = ?2, bill.transaction_mode = ?3, bill.transaction_status = ?4 where bill.billingId = ?5"
	 * ) void updateBillById(int orderId,Date transaction_date, String
	 * transaction_mode, TransactionStatus transaction_status, int billingId);
	 */
}