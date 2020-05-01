package com.cg.iter.productpriceinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.iter.productpriceinfo.entity.Product;
import com.cg.iter.productpriceinfo.entity.ProductPrice;


@RestController
@RequestMapping("/productsprice")
public class ProductPriceController {

	
	@Autowired
	RestTemplate resttemplate;
	@GetMapping("/price/{id}")
	public ProductPrice getPriceById (@PathVariable("id") int id) {
		ResponseEntity<Product[]> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/productsinfo/products/", Product[].class);
		
		Product[] body = responseEntity.getBody();
		for (int i = 0; i < body.length; i++) {
			Product product = body[i];
			if(product.getSerialNo()==id) {
				return new ProductPrice(product.getSerialNo(),product.getPrice());
				
			}
		}
		return new ProductPrice();
	}
}
