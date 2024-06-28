package com.spring.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Trainer {
	private String trainerName;
	private String trainerCourse;

	public Trainer() {
		super();
	}

	public Trainer(String trainerName, String trainerCourse) {
		super();
		this.trainerName = trainerName;
		this.trainerCourse = trainerCourse;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerCourse() {
		return trainerCourse;
	}

	public void setTrainerCourse(String trainerCourse) {
		this.trainerCourse = trainerCourse;
	}

	@Override
	public String toString() {
		return "Trainer [trainerName=" + trainerName + ", trainerCourse=" + trainerCourse + "]";
	}

}
