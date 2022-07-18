package com.project.service.impl;

import com.project.entity.Authorities;
import com.project.entity.Cart;
import com.project.entity.Customer;
import com.project.mapper.CartMapper;
import com.project.mapper.CustomerMapper;
import com.project.service.CartService;
import com.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CartService cartService;


    @Override
    @Transactional
    public int addCustomer(Customer customer) {
        //create new cart
        Cart cart = new Cart();
        cartService.addCart(cart);
        customer.setCartId(cart.getCartId());

        //create customer authorities
        Authorities authorities = new Authorities();
        authorities.setEmail(customer.getEmail());
        authorities.setAuthorities("ROLE_USER");

        //add customer authority into database
        customerMapper.addAuthorities(authorities);

        //update password to encoded password
        String encodedPassword = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(encodedPassword);

        return customerMapper.addCustomer(customer);
    }
}
