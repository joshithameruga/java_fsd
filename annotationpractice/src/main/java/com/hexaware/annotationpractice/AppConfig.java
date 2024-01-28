package com.hexaware.annotationpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "com.hexaware.annotationpractice.*")
public class AppConfig {
	
	@Bean
	public String myName() {
		return new String ("joshitha");
	}
	
}
