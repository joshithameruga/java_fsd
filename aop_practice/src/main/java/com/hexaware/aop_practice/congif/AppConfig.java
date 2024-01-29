package com.hexaware.aop_practice.congif;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.hexaware.aop_practice.*")
@EnableAspectJAutoProxy
public class AppConfig {
   
}
