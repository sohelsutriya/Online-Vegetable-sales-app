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
public interface CustomerService {
	public boolean authenticateUser(int customerId,String securityAnswer);
}
