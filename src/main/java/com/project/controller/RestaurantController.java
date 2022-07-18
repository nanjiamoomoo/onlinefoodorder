package com.project.controller;

import com.project.entity.Restaurant;
import com.project.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @ResponseBody
    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    public List<Restaurant> getRestaurants() {
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        return restaurants;
    }
}
