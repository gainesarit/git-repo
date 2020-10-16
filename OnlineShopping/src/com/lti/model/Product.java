package com.lti.model;

public class Product {
    int productId;
    String ProductName;
    String productDescrption;
	int id;
	String name="Sarit";
	int gold=0;
	String result="good";
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDescrption() {
		return productDescrption;
	}
	public void setProductDescrption(String productDescrption) {
		this.productDescrption = productDescrption;
	}
}
