package com.project.mapper;

import com.project.entity.MenuItem;

import java.util.List;

public interface MenuItemMapper {
    /**
     * find menu information based on the menuitem id
     * @return the menu info
     */
    MenuItem findMenuItemByID(int menuItemId);

    /**
     * find all the menus of a restaurant based on restaurant id
     * @param restaurantId
     * @return a list of menu items
     */
    List<MenuItem> findMenusByRestaurantId(int restaurantId);
}
