package com.project.service;

import com.project.entity.MenuItem;
import com.project.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    /**
     * get all restaurants
     * @return restaurants
     */
    List<Restaurant> getRestaurants();

}
