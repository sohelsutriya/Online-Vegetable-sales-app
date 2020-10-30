/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.stereotype.Service;

/**
 * @author sohel
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public boolean authenticateUser(int customerId,String securityAnswer) {
		//use rest template to get security answer from customer ms
		//check it with this security answer and return boolean
		return true;
	}

}
