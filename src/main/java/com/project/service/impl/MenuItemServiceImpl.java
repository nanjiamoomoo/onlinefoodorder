package com.project.service.impl;

import com.project.entity.MenuItem;
import com.project.mapper.MenuItemMapper;
import com.project.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    @Autowired
    private MenuItemMapper menuItemMapper;

    @Override
    public List<MenuItem> getMenusByRestaurantId(int restaurantId) {
        return menuItemMapper.getMenusByRestaurantId(restaurantId);
    }

    @Override
    public MenuItem getMenuItemById(int menuItemId) {
        return menuItemMapper.getMenuItemById(menuItemId);
    }
}
