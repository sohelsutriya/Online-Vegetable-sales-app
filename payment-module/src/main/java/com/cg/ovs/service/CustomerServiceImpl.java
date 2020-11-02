/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.ovs.bean.Customer;

/**
 * @author sohel
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	RestTemplate restTemplate;

	@Override
	public boolean authenticateUser(int customerId, String securityAnswer) {
		// use rest template to get security answer from customer ms
		// check it with this security answer and return boolean
		Customer cust=restTemplate.getForEntity("http://localhost:5060/customer/customerbyId/"+customerId, Customer.class).getBody();
		System.out.println(cust);
		if(cust.getSecurityPassword().equals(securityAnswer)) {
			System.out.println("true");
			return true;
		}		
		else
			return false;
	}

}
