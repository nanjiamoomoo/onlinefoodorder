package com.project.service.impl;

import com.project.entity.CartWrapper;
import com.project.entity.Cart;
import com.project.entity.OrderItem;
import com.project.mapper.CartMapper;
import com.project.mapper.CustomerMapper;
import com.project.mapper.OrderItemMapper;
import com.project.service.CartService;
import com.project.service.CustomerService;
import com.project.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service

public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;


    @Override
    @Transactional
    public int addCart(Cart cart) {
        return cartMapper.addCart(cart);
    }

    @Override
    public Cart findCartById(int cartId) {
        return cartMapper.findCartById(cartId);
    }

    @Override
    @Transactional
    public int updateCartTotalPrice(double total, int cartId) {
        return cartMapper.updateCartTotalPrice(total, cartId);
    }

    @Override
    public CartWrapper getCart() {
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();

        //get the current loggedInUser username
        String username = loggedInUser.getName();

        //get cartId based on the username
        Integer cartId = customerMapper.getCustomerCartIdByUsername(username);

        //find cart
        Cart cart = findCartById(cartId);

        //get all the
        List<OrderItem> orderItemsList = findOrderItemsByCartId(cartId);

        //create CartWrapper object
        CartWrapper cartWrapper = new CartWrapper();
        cartWrapper.setCartId(cartId);
        cartWrapper.setTotalPrice(cart.getTotalPrice());
        cartWrapper.setOrderItemList(orderItemsList);
        return cartWrapper;
    }

    @Override
    public List<OrderItem> findOrderItemsByCartId(int cartId) {
        return cartMapper.findOrderItemsByCartId(cartId);
    }

    @Override
    @Transactional
    public void cleanCart() {
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();

        //get the current loggedInUser username
        String username = loggedInUser.getName();

        //get cartId based on the username
        Integer cartId = customerMapper.getCustomerCartIdByUsername(username);

        orderItemMapper.removeAllOrderItemsWithCartId(cartId);
        updateCartTotalPrice(0, cartId);
    }
}
