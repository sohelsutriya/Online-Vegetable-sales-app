package com.cg.ovs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Customer;
import com.cg.ovs.dao.CustomerDao;

@Service
public class CustomerService {

@Autowired
CustomerDao dao;

public Customer addCustomer(Customer customer) {
	return dao.save(customer);
}

public Customer updateCustomer(Customer customer) {
	return dao.save(customer);
}

public Optional<Customer> findCustomerById(int id) {
	return dao.findById(id);
}

public Customer findCustomerByUsername(String username) {
	return dao.findByUserName(username);
	}

public List<Customer> getCustomers(){
	return dao.findAll();
}
}
