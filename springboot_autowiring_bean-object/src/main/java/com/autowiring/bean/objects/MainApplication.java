package com.autowiring.bean.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
     Customer customer = (Customer) context.getBean("customer");
     System.out.println("city of the customer: "+customer.getDeliveryAddress().getCity());
     System.out.println(customer.toString());
	}

}
