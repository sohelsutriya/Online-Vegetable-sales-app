/**
 * 
 */
package com.cg.ovs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ovs.bean.Product;

/**
 * @author sohel
 *
 */
@Service
public interface ProductService {
	public Product addVegetable(Product product);

	public Product updateVegetable(Product product);

	public void deleteById(int prodId);

	public List<Product> viewAllVegetables();

	public Product findByProductId(int prodId);

	public List<Product> getProductByProductName(String prodName);

}
