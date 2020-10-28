package com.cg.ovs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {

	@Query("Select c from Customer c where c.username=?1")
	public Customer findByUserName(String username);
}
