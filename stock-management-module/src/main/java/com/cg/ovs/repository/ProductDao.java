package com.cg.ovs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovs.bean.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

	// @Query("Select p from Product a where p.prodId=?1")
	// public Product viewVegetableById(int prodId);

	// public Product delete(int prodId);

	// public Product save(Product p);

}
