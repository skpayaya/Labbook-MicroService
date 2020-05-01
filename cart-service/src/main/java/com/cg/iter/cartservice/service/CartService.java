package com.cg.iter.cartservice.service;

import java.util.List;

import com.cg.iter.cartservice.entity.Cart;

public interface CartService {

	public Cart addToCart(Cart cart);

	public void removeFromCart(int id);

	public List<Cart> getAll();

}
