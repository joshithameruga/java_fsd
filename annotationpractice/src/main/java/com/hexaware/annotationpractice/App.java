package com.hexaware.annotationpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.annotationpractice.service.IService;
import com.hexaware.annotationpractice.service.ServiceImpl;

//@Configuration
//@ComponentScan(basePackages = "com.hexaware.annotationpractice.*")
public class App 
{
    public static void main( String[] args )
    {   
    	ApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//into to annotations
     /* Customer customer= context.getBean(Customer.class);
        
        customer.setName("rachel");
        customer.setEmail("rachel@gmail");
        System.out.println(customer);
        
        Payment payment = context.getBean(Payment.class);
        payment.setAmount(5000);
        payment.setModeOfPayment("phonepe");
        System.out.println(payment);   */
        
    /*	//dependency injecton using setter
    	Payment payment = context.getBean(Payment.class);
    	payment.setAmount(8000);
    	payment.setModeOfPayment("credit card");
    	System.out.println(payment);
    	
    	Customer customer= context.getBean(Customer.class);
    	customer.setName("rachel");
        customer.setEmail("rachel@gmail");
        customer.setPayment(payment);
        System.out.println(customer); */
        
    	//DI using  autowired
    	//Customer customer= context.getBean(Customer.class);
    	//System.out.println(customer);
    	
    	
    	
    	//testing DI using autowired setter method
    	//System.out.println(customer.getPayment());
    	
    	//getting bean using name in AppConfig
    	String name = context.getBean("myName",String.class);
    	System.out.println(name);
    	
    	
    	IService service = context.getBean(ServiceImpl.class);
    	service.showService();
    	
    	
        
    }
}
