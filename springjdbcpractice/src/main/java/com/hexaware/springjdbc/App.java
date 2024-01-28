package com.hexaware.springjdbc;


import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.model.Customer; // Updated import statement
import com.hexaware.springjdbc.service.ICustomerService; // Updated import statement
import com.hexaware.springjdbc.service.CustomerServiceImp; // Updated import statement

/**
 * Hello world!
 *
 */
public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ICustomerService service = context.getBean(CustomerServiceImp.class); // Updated service interface and implementation class

        boolean flag = true;

        while (flag) {
            System.out.println("****WELCOME TO ROAD READY ***");
            System.out.println("1. INSERT");
            System.out.println("2. UPDATE");
            System.out.println("3. DELETE");
            System.out.println("4. SELECT BY ID");
            System.out.println("5. SELECT ALL");
            System.out.println("6. EXIT");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    Customer customer = readData(); 

                    boolean isInserted = service.createCustomer(customer);

                    if (isInserted) {
                        System.out.println("Record inserted successfully...");
                    } else {
                        System.err.println("Insert fail");
                    }

                    break;

                case 2:

                    Customer updatedCustomer = readData(); 

                    boolean isUpdated = service.updateCustomer(updatedCustomer); 

                    if (isUpdated) {
                        System.out.println("Record Updated successfully...");
                    } else {
                        System.err.println("Update fail");
                    }

                    break;

                case 3:

                    System.out.println("Enter Customer Id"); // Updated message

                    int customerId = scanner.nextInt(); // Updated variable name

                    boolean isDeleted = service.deleteCustomerById(customerId); // Updated method

                    if (isDeleted) {
                        System.out.println("Record Deleted successfully...");
                    } else {
                        System.err.println("Delete fail");
                    }

                    break;

                case 4:

                    System.out.println("Enter Customer Id");

                    int customerId1 = scanner.nextInt();

                    Customer customerFound = service.selectCustomerById(customerId1);

                    if (customerFound != null) {
                        System.out.println(customerFound);
                    } else {
                        System.err.println("Customer Not Found");
                    }

                    break;

                case 5:

                    List<Customer> list = service.selectAllCustomers();

                    for (Customer cust : list) {
                        System.out.println(cust);
                    }

                    break;

                case 6:

                    flag = false;

                    break;

                default:
                    break;
            }

        }

    }

    public static Customer readData() {
        Customer customer = new Customer(); 

        System.out.println("Enter Customer Id"); 

        customer.setCustomerId(scanner.nextInt()); 

        System.out.println("Enter first Name"); 

        customer.setFirstName(scanner.next()); 

        System.out.println("Enter last name"); 

        customer.setLastName(scanner.next());
        
        System.out.println("Enter email address");
        
        customer.setEmailAddress(scanner.next());
        
        System.out.println("Enter password");
        
        customer.setPassword(scanner.next());
        
        System.out.println("Enter phonenumber");
        
        customer.setPhoneNumber(scanner.nextInt());
        
        

        return customer;

    }
}
