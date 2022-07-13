package com.project.service.impl;

import com.project.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemService orderItemService;

    @Override
    public int addMenuItemToCart(Integer menuItemId) {
        return orderItemService.addMenuItemToCart(menuItemId);
    }
}
