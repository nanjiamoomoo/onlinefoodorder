package com.project.controller;

import com.project.entity.MenuItem;
import com.project.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class MenuInfoController {
    @Autowired
    private MenuItemService menuItemService;

    @ResponseBody
    @RequestMapping("/restaurant/{id}/menu")
    public List<MenuItem> getMenusByRestaurantId(@PathVariable("id") Integer restaurantId) {
        return menuItemService.getMenusByRestaurantId(restaurantId);
    }
}
