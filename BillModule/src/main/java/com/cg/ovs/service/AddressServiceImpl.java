/**
 * 
 */
package com.cg.ovs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Address;
import com.cg.ovs.repository.AddressRepository;

/**
 * @author sohel
 *
 */
@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
	AddressRepository repos;
	@Override
	public Address addAddress(Address address) {
		return repos.save(address);
	}

	/*
	 * @Override public Address getAddressByBillId(int billingId) { //return
	 * repos.fi }
	 */
	@Override
	public Address getAddressByAddressId(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

}
