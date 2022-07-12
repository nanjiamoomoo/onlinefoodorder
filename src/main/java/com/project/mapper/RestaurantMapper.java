package com.project.mapper;

import com.project.entity.Restaurant;

public interface RestaurantMapper {

    /**
     * find restaurant info based on restaurant id
     * @return restaurant info
     */
    Restaurant findRestaurantById(int RestaurantId);
}
