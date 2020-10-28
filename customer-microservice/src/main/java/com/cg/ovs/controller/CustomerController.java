package com.cg.ovs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.bean.Customer;
import com.cg.ovs.service.CustomerService;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

@Autowired
CustomerService service;

@PostMapping(value="/addcustomer",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
public Customer saveCustomer(@RequestBody Customer customer) {
	 return service.addCustomer(customer);
}

@PutMapping(value="/updatecustomer")
public Customer updateCustomer(@RequestBody Customer customer) {
return service.updateCustomer(customer);
}

@GetMapping(value="/customerbyId/{id}")
public Optional<Customer> getCustomerById(@PathVariable int id) {
	return service.findCustomerById(id);
}

@GetMapping(value="/getcustomer/{username}")
public Customer getCustomerByusername(@PathVariable String username) {
return service.findCustomerByUsername(username);
}

@GetMapping(value="/getallcustomers")
public List<Customer> getAllCustomers(){
	return service.getCustomers();
}

	
}
