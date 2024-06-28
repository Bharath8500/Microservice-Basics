package com.scope.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		Order order = (Order) context.getBean("samsung");
		System.out.println(order);
		System.out.println(order.getIphone());
	}

}
