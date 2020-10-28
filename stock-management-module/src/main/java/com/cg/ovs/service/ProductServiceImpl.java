package com.cg.ovs.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Product;
import com.cg.ovs.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao dao;

	// @Autowired
	// RestTemplate restTemplate;

	public Product addVegetable(Product product) {
		return dao.save(product);
	}

	public Product updateVegetable(Product product) {
		dao.deleteById(product.getProdId());
		return dao.save(product);
	}

	public void deleteById(int prodId) {
		dao.deleteById(prodId);
	}

	public List<Product> viewAllVegetables() {
		return dao.findAll();
	}

//	public List<Product> viewVegetableList(String category)
//	{
//		return null;
//	}

	public Product findByProductId(int prodId) {
		return dao.findById(prodId).get();
	}

	public List<Product> getProductByProductName(String prodName) {
		return dao.findAll().stream().filter(x -> (prodName.equals(x.getName()))).collect(Collectors.toList());
	}

}
