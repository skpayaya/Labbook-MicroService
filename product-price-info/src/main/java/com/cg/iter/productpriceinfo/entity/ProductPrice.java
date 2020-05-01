package com.cg.iter.productpriceinfo.entity;

public class ProductPrice {

	int serialNo;
	long price;
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public ProductPrice() {
		super();
	}
	public ProductPrice(int serialNo, long price) {
		super();
		this.serialNo = serialNo;
		this.price = price;
	}
	
	
}
