package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
    College college = (College)factory.getBean("college");
    System.out.println(college.toString());
    College college1 = (College)factory.getBean("college1");
    System.out.println(college1.toString());
	}

}
