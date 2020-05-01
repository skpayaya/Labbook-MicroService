package com.cg.iter.productinfo.service;

import java.util.List;

import com.cg.iter.productinfo.entity.Product;

public interface ProductService {

	
	List<Product> getAllProducts();
	Product showProductInfo(int id);
	void add(Product entity);
}
