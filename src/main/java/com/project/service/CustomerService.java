package com.project.service;

import com.project.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    /**
     * add a new customer
     * @param customer entity
     * @return success return 1, fail return 0
     */
    int addCustomer(Customer customer);

}
