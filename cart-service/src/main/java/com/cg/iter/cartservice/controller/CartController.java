package com.cg.iter.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.iter.cartservice.entity.Cart;
import com.cg.iter.cartservice.entity.Product;
import com.cg.iter.cartservice.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {


	@Autowired
	private CartService service;
	
	@PostMapping("/cart/{productid}")
	public Cart addToCart(@PathVariable("productid") int id) {
		
		ResponseEntity<Product[]> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/productsinfo/products/", Product[].class);
		Product[] body = responseEntity.getBody();
		for (int i = 0; i < body.length; i++) {
			Product product = body[i];
			if(product.getSerialNo()==id) {
				return service.addToCart(new Cart(product.getName(),product.getCategory()));
				
			}
		}
		
		
		
		return null;
		
	}
	
	@DeleteMapping("/cart/{productid}")
	public void removeFromCart(@PathVariable("productid") int id) {
		
		service.removeFromCart(id);
		
	}
	
	@GetMapping("/cart")
	public List<Cart> getAll() {
		return service.getAll();
	}
	
	
}
