package com.cg.ovs.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.bean.Product;
import com.cg.ovs.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping(value = "/addVegetable") // consumes = MediaType.APPLICATION_JSON_VALUE, produces =
											// MediaType.APPLICATION_JSON_VALUE)
	public Product saveVegetable(@RequestBody Product p) {
		return service.addVegetable(p);
	}

	@PutMapping(value = "/updateVegetable")
	public Product updateVegetable(@RequestBody Product p) {
		return service.updateVegetable(p);

	}

	@GetMapping(value = "/productbyId/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.findByProductId(prodId);
	}

	@GetMapping(value = "/getallproducts")
	public List<Product> getAllProducts() {
		return service.viewAllVegetables();
	}

	@GetMapping(value = "/getProductByProductName/{prodName}")
	public List<Product> getProductByProductName(@PathVariable String prodName) {
		return service.getProductByProductName(prodName);
	}
}