package com.project;

import com.project.entity.Customer;
import com.project.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void testSignUp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = context.getBean(CustomerService.class);
        Customer customer = new Customer("zack@gmail.com", "zack", "wang", "123", null);
        System.out.println(customerService.addCustomer(customer));
    }
}
