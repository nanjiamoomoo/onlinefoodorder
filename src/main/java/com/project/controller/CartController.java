package com.project.controller;

import com.project.entity.OrderItem;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class CartController {

    @RequestMapping("/cart")
    @ResponseBody
    public List<OrderItem> getCart() {
        return null;
    }


    @RequestMapping("/checkout")
    @ResponseStatus(value = HttpStatus.OK)
    public void checkout() {

    }
}
