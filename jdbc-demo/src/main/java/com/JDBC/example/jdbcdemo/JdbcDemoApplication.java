package com.JDBC.example.jdbcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcDemoApplication.class, args);
		BDConnection bookDetails = context.getBean(BDConnection.class);
//		bookDetails.retriveBookDetails();
//		bookDetails.createBookDeatail("B123", "Microservices", (float) 12.12, 2);
		bookDetails.deleteBookdetails("B123");
		bookDetails.updateBookDetails("A11");
	}

}
