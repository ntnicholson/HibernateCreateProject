package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String name, double price) {
		super();
		this.productId = productId;
		this.productName = name;
		this.productPrice = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String name) {
		this.productName = name;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double price) {
		this.productPrice = price;
	}
	
}
