package com.scope.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("samsung")
public class Order {
	private String orderId;
	@Autowired
	private Product iphone;

	public Order() {
		super();
	}

	public Order(String orderId, Product iphone) {
		super();
		this.orderId = orderId;
		this.iphone = iphone;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Product getIphone() {
		return iphone;
	}

	public void setIphone(Product iphone) {
		this.iphone = iphone;
	}

}