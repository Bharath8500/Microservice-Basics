package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
		Student student = (Student)factory.getBean("student");
		student.setId(1);
		student.setName("Bharath");
		System.out.println(student.toString());
   //System.out.println("hi");
	}

}
