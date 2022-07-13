package com.project.service.impl;

import com.project.entity.OrderItem;
import com.project.mapper.CartMapper;
import com.project.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

}
