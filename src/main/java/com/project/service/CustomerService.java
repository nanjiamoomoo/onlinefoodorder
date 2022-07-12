package com.project.service;

import com.project.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    int addCustomer(Customer customer);
}
