package com.project.service.impl;

import com.project.entity.Customer;
import com.project.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailedServiceImpl implements UserDetailsService {

    @Autowired
    private CustomerMapper customerMapper;

    /**
     * @param email of the customer
     * @return the customer information from the database
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        //find customer based on customer email
        Customer customer = customerMapper.findCustomerByEmail(email);

        //find authority based on customer email
        String customerAuthority = customerMapper.findCustomerAuthorityByEmail(email);

        //if customer not found, throw exception
        if (customer == null) {
            throw new UsernameNotFoundException("Customer does not exist!");
        }

        //add customer information into customerDetails
        UserDetails customerDetails = new User(email, customer.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList(customerAuthority));
        return customerDetails;
    }
}
