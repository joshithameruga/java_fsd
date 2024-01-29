package com.hexaware.aop_practice.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop_practice.exception.CustomerNotFoundException;

@Component
@Aspect
public class CustomerAspect {
 
	@Before(" execution(* com.hexaware.aop_practice.service.*.*())")
	public void beforeLogs() {
		System.out.println("checking for customer in db before any customer service");
	}
	
	@After(" execution(* com.hexaware.aop_practice.service.CustomerService.updateCustomer())")
	public void afterLogs() {
		System.out.println("checking for customer in db after updating customer");
	}
	
	@Pointcut(" execution(* com.hexaware.aop_practice.service.CustomerService.getCustomer(..))")
	public void afterReturningPointcut() {
		
	}
	
	@AfterReturning(pointcut = "afterReturningPointcut()",returning="customer")
	public void afterreturningcustomer(String customer) {
		System.out.println("logs after returning customer  " + customer);
	}
	
	@AfterThrowing( pointcut = " afterReturningPointcut()" , throwing = "e")
	public void   afterThrowingExp(CustomerNotFoundException e) {
		
		System.out.println("Logs after throwing exp : "+e);
}
}