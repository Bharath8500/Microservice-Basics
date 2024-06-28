package com.annotation;

import org.springframework.stereotype.Component;

@Component
public interface Animal {
	public int countNoOfAnimals();
	public String colorOfAnimal();

}
