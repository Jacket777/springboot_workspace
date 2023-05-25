package com.ithema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching //开启Spring Boot基于注解的缓存管理支持
@SpringBootApplication
public class Chapter06Application {
	public static void main(String[] args) {
		SpringApplication.run(Chapter06Application.class, args);
	}
}