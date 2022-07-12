package com.project.mapper;

import com.project.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    int addCustomer(Customer customer);
}
