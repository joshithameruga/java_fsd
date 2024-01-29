package com.hexaware.aop_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop_practice.congif.AppConfig;
import com.hexaware.aop_practice.exception.CustomerNotFoundException;
import com.hexaware.aop_practice.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        CustomerService service = context.getBean(CustomerService.class);
        
        service.addCustomer();
        
        service.deleteCustomer();
        
        service.updateCustomer();
        
        /*try {
			service.getCustomer(101);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
        try {
			service.getCustomer(90);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
