package com.cg.iter.recommendationservice.entity;

public class Product {

	private int serialNo;
	private String name;
	private long price;
	private String category;
	
	public Product(String name, long price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Product(int id, String name, long price, String category) {
		super();
		this.serialNo = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Product() {
		super();
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
