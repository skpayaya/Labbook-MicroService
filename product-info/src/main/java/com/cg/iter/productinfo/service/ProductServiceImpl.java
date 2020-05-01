package com.cg.iter.productinfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.productinfo.dao.ProductDao;
import com.cg.iter.productinfo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductDao dao;
	
	@Override
	public List<Product> getAllProducts() {
		return dao.findAll();
		
	}

	@Override
	public Product showProductInfo(int id) {
		return dao.getOne(id);
		
	}
	@Override
	public void add(Product entity) {
		dao.save(entity);
	}

}
