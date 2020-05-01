package com.cg.iter.cartservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.cartservice.entity.Cart;

public interface CartDao extends JpaRepository<Cart, Integer> {

}
