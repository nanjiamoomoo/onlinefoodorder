package com.project.mapper;

import com.project.entity.MenuItem;
import com.project.entity.Restaurant;

import java.util.List;

public interface RestaurantMapper {
    /**
     * get all restaurants
     * @return restaurants
     */
    List<Restaurant> getRestaurants();

}
