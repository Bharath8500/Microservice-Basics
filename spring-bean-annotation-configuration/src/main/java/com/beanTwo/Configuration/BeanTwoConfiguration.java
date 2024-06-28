package com.beanTwo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.annotation.configuration.Customer;

@Configuration
public class BeanTwoConfiguration {
	@Bean("customer")
	public Customer getCustomerBean() {
		return getCustomerInfo();
	}
	public Customer getCustomerInfo() {
		Customer customer = new Customer();
		customer.setCustomerId("bc454s");
		customer.setCustomerName("Bharath Chavala");
		return customer;
	}

}
