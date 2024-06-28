package com.spring.annotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.*");
		Address address= (Address) context.getBean("address");
		System.out.println(address.toString());
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.toString());
	}

}
