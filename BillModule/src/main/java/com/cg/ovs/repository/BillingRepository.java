/**
 * 
 */
package com.cg.ovs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.BillingDetails;

/**
 * @author sohel
 *
 */
@Repository
public interface BillingRepository extends JpaRepository<BillingDetails, Integer> {

}
