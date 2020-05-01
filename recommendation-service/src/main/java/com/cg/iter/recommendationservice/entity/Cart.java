package com.cg.iter.recommendationservice.entity;

public class Cart {
	
	private int orderId;
	private String productName;
	private String category;
	public Cart(int orderId, String productName, String category) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.category = category;
	}
	
	public Cart(String productName, String category) {
		super();
		this.productName = productName;
		this.category = category;
	}

	public Cart() {
		super();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
