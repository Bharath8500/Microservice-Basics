package com.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new FileSystemXmlApplicationContext("//Users//bharathchowdary//Documents//Java_Programs//MicroServices//employee-dependency-injection//src//main//resources//beans.xml");
		Employee employee = (Employee) factory.getBean("employeeDetails");
		System.out.println(employee.toString());
		Employee employeeConstructor = (Employee) factory.getBean("employeeDetailsCon");
		System.out.println(employeeConstructor.toString());

	}

}
