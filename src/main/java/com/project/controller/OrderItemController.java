package com.project.controller;

import com.project.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @RequestMapping("/order/{menuItemId}")
    public void addMenuItemToCart(@PathVariable("menuItemId") Integer menuItemId) {
        orderItemService.addMenuItemToCart(menuItemId);
    }


}
