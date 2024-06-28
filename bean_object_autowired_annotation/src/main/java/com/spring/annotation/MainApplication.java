package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		NareshIt nareshIt = (NareshIt) context.getBean(NareshIt.class);
		System.out.println(nareshIt);
//		NareshIt nareshIt1 = (NareshIt) context.getBean("nareshItBean");
//		System.out.println(nareshIt1);
//		Trainer trainer = (Trainer) context.getBean("springTrainer");
//		System.out.println(trainer.toString());

	}

}
