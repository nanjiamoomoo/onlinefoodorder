package com.project.mapper;

import com.project.entity.Restaurant;

import java.util.List;

public interface RestaurantMapper {

    /**
     * get all restaurants info
     * @return restaurants info
     */
    List<Restaurant> getRestaurants();
}
