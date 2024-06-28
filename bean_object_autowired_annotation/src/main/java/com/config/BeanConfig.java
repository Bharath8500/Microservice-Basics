package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.annotation.NareshIt;
import com.spring.annotation.Trainer;

@Configuration
public class BeanConfig {
	@Bean("nareshIt")
	public NareshIt getNareshItInfoBeanSpring() {
		return new NareshIt();
	}
	@Bean("springCourse")
	public Trainer getSpringCourseTrainer() {
		return new Trainer();
	}
	
	@Bean("microServiceCourse")
	public Trainer getMicroServiceCourseTrainer() {
		return new Trainer();
	}

}
