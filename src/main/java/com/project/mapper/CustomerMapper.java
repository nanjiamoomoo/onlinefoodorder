package com.project.mapper;

import com.project.entity.Authorities;
import com.project.entity.Customer;

public interface CustomerMapper {
    /**
     * add a new customer
     * @param customer entity
     * @return success return 1, fail return 0
     */
    int addCustomer(Customer customer);

    /**
     * add customer authority
     * @param authorities
     * @return success return 1, fail return 0
     */
    int addAuthorities(Authorities authorities);

    /**
     * find customer by customer email address
     * @param email of customer
     * @return the customer bean
     */
    Customer findCustomerByEmail(String email);

    /**
     * find customer authority by customer email address
     * @param email of customer
     * @return the authority of the customer
     */
    String findCustomerAuthorityByEmail(String email);

    /**
     * find customer cartId by customer username(email address)
     * @param username (customer email address)
     * @return cartId
     */
    Integer getCustomerCartIdByUsername(String username);

}
