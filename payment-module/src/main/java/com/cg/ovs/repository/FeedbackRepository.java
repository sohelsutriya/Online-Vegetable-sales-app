/**
 * 
 */
package com.cg.ovs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.Feedback;

/**
 * @author sohel
 *
 */
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
	public Feedback findByCustomerId(int customerId);
}
