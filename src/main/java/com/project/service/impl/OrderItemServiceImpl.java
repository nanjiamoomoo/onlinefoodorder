package com.project.service.impl;

import com.project.entity.Cart;
import com.project.entity.MenuItem;
import com.project.entity.OrderItem;
import com.project.mapper.CustomerMapper;
import com.project.mapper.OrderItemMapper;
import com.project.service.CartService;
import com.project.service.CustomerService;
import com.project.service.MenuItemService;
import com.project.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private MenuItemService menuItemService;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CartService cartService;

    @Override
    public int addMenuItemToCart(Integer menuItemId) {
        final OrderItem orderItem = new OrderItem();
        final MenuItem menuItem = menuItemService.getMenuItemById(menuItemId);

        //find the current loggedInUser info
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();

        //get the current loggedInUser username
        String username = loggedInUser.getName();
        System.out.println(username);

        //get cartId based on the username
        Integer cartId = customerMapper.getCustomerCartIdByUsername(username);
        System.out.println(cartId);

        //set attributes to the new orderItem object
        orderItem.setQuantity(1);
        orderItem.setMenuItemId(menuItemId);
        orderItem.setPrice(menuItem.getPrice());
        orderItem.setCartId(cartId);

        //add orderItem in database
        orderItemMapper.addOrderItem(orderItem);

        //find cart by id
        Cart cart= cartService.findCartById(cartId);

        //update cart total price
        Double currentPrice = cart.getTotalPrice();
        Double total = currentPrice + orderItem.getPrice();

       return cartService.updateCartTotalPrice(total, cartId);
    }

}
