package com.project.service.impl;

import com.project.entity.Cart;
import com.project.mapper.CartMapper;
import com.project.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;
    @Override
    public int addCart(Cart cart) {
        return cartMapper.addCart(cart);
    }
}
