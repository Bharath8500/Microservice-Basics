package com.spring.annotation.configuration;

public class Customer {
	private String customerName;
	private String customerId;

	public Customer() {
		super();
	}

	public Customer(String customerName, String customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + "]";
	}

}
