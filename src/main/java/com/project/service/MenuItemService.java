package com.project.service;

import com.project.entity.MenuItem;

import java.util.List;

public interface MenuItemService {

    /**
     * get menuItems of a restaurant based on restaurantId
     * @param restaurantId
     * @return a list of menuItems
     */
    List<MenuItem> getMenusByRestaurantId(int restaurantId);


    /**
     * get menuItem by the menuItemId
     * @param menuItemId
     * @return the menuItem entity
     */
    MenuItem getMenuItemById(int menuItemId);
}
