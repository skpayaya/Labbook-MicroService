package com.cg.iter.productinfo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.productinfo.entity.Product;
import com.cg.iter.productinfo.service.ProductService;

@RestController
@RequestMapping("/productsinfo")
public class ProductController {

	
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> getAll() {
		return service.getAllProducts();
	}
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return service.showProductInfo(id);
	}
	
	@PostConstruct
	public void se() {
		Product p = new Product("HP12345",70000,"Laptop");
		service.add(p);
		Product p1 = new Product("HP12346",10000,"Laptop");
		service.add(p1);
		Product p2 = new Product("HP12347",20000,"Laptop");
		service.add(p2);
		Product p3 = new Product("HP12348",30000,"Laptop");
		service.add(p3);
		Product p4 = new Product("IPhone8",30000,"Phone");
		service.add(p4);
		Product p5 = new Product("IPhone7",30000,"Phone");
		service.add(p5);
	}
}
