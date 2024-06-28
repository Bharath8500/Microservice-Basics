package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {

	@Override
	public int countNoOfAnimals() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public String colorOfAnimal() {
		// TODO Auto-generated method stub
		return "This animal tiger is Red";
	}

}
