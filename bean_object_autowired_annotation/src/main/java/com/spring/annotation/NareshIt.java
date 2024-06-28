package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("nareshIt")
public class NareshIt {
	private String nareshItName;
	@Autowired
	private Trainer trainer;

	public NareshIt() {
		super();
	}

	public NareshIt(String nareshItName, Trainer trainer) {
		super();
		this.nareshItName = nareshItName;
		this.trainer = trainer;
	}

	public String getNareshItName() {
		return nareshItName;
	}

	public void setNareshItName(String nareshItName) {
		this.nareshItName = nareshItName;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "NareshIt [nareshItName=" + nareshItName + ", trainer=" + trainer + "]";
	}

}
