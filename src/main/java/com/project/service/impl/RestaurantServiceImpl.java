package com.project.service.impl;

import com.project.entity.Restaurant;
import com.project.mapper.RestaurantMapper;
import com.project.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantMapper restaurantMapper;

    @Override
    public List<Restaurant> getRestaurants() {
        return restaurantMapper.getRestaurants();
    }
}
