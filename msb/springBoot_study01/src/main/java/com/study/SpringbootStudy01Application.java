package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.study")
public class SpringbootStudy01Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudy01Application.class, args);
	}

}
