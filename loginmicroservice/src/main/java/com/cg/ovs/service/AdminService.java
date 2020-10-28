package com.cg.ovs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Admin;
import com.cg.ovs.dao.AdminDao;

@Service
public class AdminService {

@Autowired
AdminDao dao;

public Admin getAdminByUsername(String username) {
	return dao.getAdmin(username);
	}
}
