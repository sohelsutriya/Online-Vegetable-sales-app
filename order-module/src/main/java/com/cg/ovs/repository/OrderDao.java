package com.cg.ovs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.OrderDetails;

@Repository
public interface OrderDao extends JpaRepository<OrderDetails, Integer> {
	
	
}
