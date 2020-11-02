/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Address;

/**
 * @author sohel
 *
 */
@Service
public interface AddressService {
	public Address addAddress(Address address);

//	public Address getAddressByBillId(int billingId);

	public Address getAddressByAddressId(int addressId);
}
