/**
 * 
 */
package com.cg.ovs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.Address;

/**
 * @author sohel
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	//public Address findAddress
}
