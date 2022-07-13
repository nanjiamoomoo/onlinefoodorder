package com.project.mapper;

import com.project.entity.MenuItem;

import java.util.List;

public interface MenuItemMapper {

    /**
     * get menu times of a restaurant based on restaurant id
     * @param restaurantId
     * @return a list of menu items
     */
    List<MenuItem> getMenusByRestaurantId(int restaurantId);


}
