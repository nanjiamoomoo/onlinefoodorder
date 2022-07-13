package com.project.service.impl;

import com.project.entity.Authorities;
import com.project.entity.Cart;
import com.project.entity.Customer;
import com.project.mapper.AuthoritiesMapper;
import com.project.mapper.CartMapper;
import com.project.mapper.CustomerMapper;
import com.project.service.CartService;
import com.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private AuthoritiesMapper authoritiesMapper;

    @Override
    @Transactional
    public int addCustomer(Customer customer) {
        //create new cart
        Cart cart = new Cart();
        cartMapper.addCart(cart);
        customer.setCartId(cart.getCartId());

        //add authorities
        Authorities authorities = new Authorities();
        authorities.setEmail(customer.getEmail());
        authorities.setAuthorities("ROLE_USER");

        authoritiesMapper.addAuthorities(authorities);
        return customerMapper.addCustomer(customer);
    }
}
