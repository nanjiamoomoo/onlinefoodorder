package com.project.mapper;

import com.project.entity.MenuItem;

import java.util.List;

public interface MenuItemMapper {

    /**
     * get menuItems of a restaurant based on restaurantId
     * @param restaurantId
     * @return a list of menuItems
     */
    List<MenuItem> getMenusByRestaurantId(int restaurantId);


    /**
     * get menuItem by the menuItemId
     * @param menuitem id
     * @return the menuItem entity
     */
    MenuItem getMenuItemById(int menuItemId);


}
