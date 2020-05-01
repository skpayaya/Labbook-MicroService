package com.cg.iter.recommendationservice.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.iter.recommendationservice.entity.Cart;
import com.cg.iter.recommendationservice.entity.Product;


@RestController
@RequestMapping("/recommend")
public class RecommendController {
	
	@GetMapping("/getrecommendations")
	public List<Product> getRecommedation() {
		
		Set<String> categoryAdded = new HashSet<>();
		ResponseEntity<Cart[]> responseCart=new RestTemplate().getForEntity("http://localhost:8030/cart/cart/", Cart[].class);
		Cart[] cartList = responseCart.getBody();
		for (int i = 0; i < cartList.length; i++) {
			Cart cart = cartList[i];
			categoryAdded.add(cart.getCategory());
			
		}
		
		List<Product> products = new ArrayList();
		ResponseEntity<Product[]> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/productsinfo/products/", Product[].class);
		Product[] body = responseEntity.getBody();
		for (int i = 0; i < body.length; i++) {
			Product product = body[i];
			if(categoryAdded.contains(product.getCategory())) {
				products.add(product);
			}
		}
		return products;
	}

}
