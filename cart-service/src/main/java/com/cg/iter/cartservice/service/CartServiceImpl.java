package com.cg.iter.cartservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.cartservice.dao.CartDao;
import com.cg.iter.cartservice.entity.Cart;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao dao;
	
	@Override
	public Cart addToCart(Cart cart) {
		return dao.save(cart);
	}


	@Override
	public void removeFromCart(int id) {
		dao.deleteById(id);
	}


	@Override
	public List<Cart> getAll() {
		return dao.findAll();
	}

}
