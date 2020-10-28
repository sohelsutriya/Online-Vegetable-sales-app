package com.cg.ovs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {

@Query("Select a from Admin a where a.username=?1")
public Admin getAdmin(String username);
	
}
