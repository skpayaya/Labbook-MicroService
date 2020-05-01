package com.cg.iter.productinfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.iter.productinfo.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
