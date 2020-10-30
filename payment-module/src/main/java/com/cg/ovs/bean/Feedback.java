/**
 * 
 */
package com.cg.ovs.bean;

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
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int feedbackId;
	@Column
	int customerId;
	@Column
	int rating;
	@Column
	String comments;

	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(int feedbackId, int customerId, int rating, String comments) {
		super();
		this.feedbackId = feedbackId;
		this.customerId = customerId;
		this.rating = rating;
		this.comments = comments;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", customerId=" + customerId + ", rating=" + rating
				+ ", comments=" + comments + "]";
	}

}
