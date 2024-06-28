package com.bean_scope;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.*");
		Address address = (Address) context.getBean("address1");
		System.out.println("Address of the Object address: "+address);
		System.out.println(address.toString());
		
		Address address2 = (Address) context.getBean("address2");
		System.out.println("Address of the Object address2: "+address2);
		System.out.println(address2.toString());
		
		Address address3 = (Address) context.getBean("address3");
		System.out.println("Address of the Object address3: "+address3);
		System.out.println(address3.toString());
//		Address address3 = (Address) context.getBean(Address.class);
//		System.out.println(address3);

	}
}
