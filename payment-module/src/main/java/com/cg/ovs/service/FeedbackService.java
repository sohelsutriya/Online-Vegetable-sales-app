/**
 * 
 */
package com.cg.ovs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Feedback;

/**
 * @author sohel
 *
 */
@Service
public interface FeedbackService {
	public Feedback getFeedbackById(int feedbackId);
	
	public Feedback addFeedback(Feedback feedback);
	
	public Feedback getFeedbackByCustomerId(int customerId);
	
	public List<Feedback> getAllFeedbacks();
}
