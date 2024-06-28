package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalManagement {
	private String animalInfo;
	@Qualifier("lion")
	@Autowired
	private Animal animal;

	public AnimalManagement() {
		super();
	}

	public AnimalManagement(String animalInfo, Animal animal) {
		super();
		this.animalInfo = animalInfo;
		this.animal = animal;
	}

	public String getAnimalInfo() {
		return animalInfo;
	}

	public void setAnimalInfo(String animalInfo) {
		this.animalInfo = animalInfo;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "AnimalManagement [animalInfo=" + animalInfo + ", animal=" + animal + "]";
	}

}
