package com.autowiring.bean.objects;

public class Customer {
	private String customerName;
	private String customerId;
	private Address deliveryAddress;

	public Customer() {
		super();
	}

	public Customer(String customerName, String customerId, Address deliveryAddress) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.deliveryAddress = deliveryAddress;
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

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", deliveryAddress="
				+ deliveryAddress + "]";
	}

}
