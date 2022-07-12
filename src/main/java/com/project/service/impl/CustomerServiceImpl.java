package com.project.service.impl;

import com.project.entity.Cart;
import com.project.entity.Customer;
import com.project.mapper.CustomerMapper;
import com.project.service.CartService;
import com.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CartService cartService;

    @Override
    public int addCustomer(Customer customer) {
        Cart cart = new Cart();
        cartService.addCart(cart);
        customer.setCartId(cart.getCartId());
        System.out.println(customer);
        return customerMapper.addCustomer(customer);
    }
}
