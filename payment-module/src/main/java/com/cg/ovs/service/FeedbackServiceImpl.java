/**
 * 
 */
package com.cg.ovs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Feedback;
import com.cg.ovs.repository.FeedbackRepository;

/**
 * @author sohel
 *
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	FeedbackRepository repos;
	@Override
	public Feedback getFeedbackById(int feedbackId) {
		return repos.findById(feedbackId).get();
	}

	@Override
	public Feedback addFeedback(Feedback feedback) {
		return repos.save(feedback);
	}

	@Override
	public Feedback getFeedbackByCustomerId(int customerId) {
		return repos.findByCustomerId(customerId);
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		return repos.findAll();
	}
	
}
