package com.spring.learningSpringBoot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningSpringBootApplication {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		//ApplicationContext context=
				SpringApplication.run(LearningSpringBootApplication.class, args);


		//Developer developer=context.getBean(Developer.class);
		//developer.greet();

	}

}
