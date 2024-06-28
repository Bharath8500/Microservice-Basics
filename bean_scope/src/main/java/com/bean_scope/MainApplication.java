package com.bean_scope;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory factory = new FileSystemXmlApplicationContext("//Users//bharathchowdary//Documents//Java_Programs//MicroServices//bean_scope//src/main//resources//beans.xml");
	Patient patient1 =  (Patient)factory.getBean("patient");
	 System.out.println(patient1);
	 Patient patient2 = (Patient) factory.getBean("patient");
	 System.out.println(patient2);
	 
	 Patient patient3= (Patient) factory.getBean("listAddress");
	ArrayList<Address> address = patient3.getAddress();
	 for(Address add: address) {
		 System.out.println("City: "+add.getCity()+" State:"+add.getState()+" ");
	 }
	}

}
