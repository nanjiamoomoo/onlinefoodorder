package com.project.service;

import com.project.entity.MenuItem;

import java.util.List;

public interface MenuItemService {

    List<MenuItem> getMenusByRestaurantId(Integer restaurantId);
}
