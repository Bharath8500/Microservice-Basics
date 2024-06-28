package com.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Lion implements Animal {

	@Override
	public int countNoOfAnimals() {
		// TODO Auto-generated method stub
		return 110;
	}

	@Override
	public String colorOfAnimal() {
		// TODO Auto-generated method stub
		return "This animal lion is Black";
	}

	@Override
	public String toString() {
		return "Lion [countNoOfAnimals()=" + countNoOfAnimals() + ", colorOfAnimal()=" + colorOfAnimal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
