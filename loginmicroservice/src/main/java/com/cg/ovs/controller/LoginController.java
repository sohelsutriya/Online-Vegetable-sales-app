package com.cg.ovs.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.ovs.bean.Admin;
import com.cg.ovs.bean.Customer;
import com.cg.ovs.service.AdminService;

@RestController
@RequestMapping(value="/login")
public class LoginController {

@Autowired
AdminService service;

@Autowired
RestTemplate restTemplate;

@GetMapping(value="/getcustomer/{username}/{password}")
public String verifyCustomerLogin(@PathVariable String username,@PathVariable String password) {
	
	final String CUSTOMER_URL="http://localhost:8100/customer/getcustomer";

	Customer customer=restTemplate.getForObject(CUSTOMER_URL+'/'+username, Customer.class);
	System.out.println(customer);
	if(customer!=null && customer.getPassword().equals(password)) {
		return "Login Sucessfull";
	}
		else {
			return "Login Failed";
		}
	}

@GetMapping(value="/getadmin/{adminUsername}/{adminPassword}")
public String verifyAdminLogin(@PathVariable String adminUsername,@PathVariable String adminPassword) {

Admin admin=service.getAdminByUsername(adminUsername);

if(admin!=null && admin.getPassword().equals(adminPassword)) {
	return "Login sucessfull";
}
else {
	return "Login Failed";
}
}
}

