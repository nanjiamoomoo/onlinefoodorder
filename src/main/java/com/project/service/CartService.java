package com.project.service;

import com.project.entity.Cart;
import com.project.entity.CartWrapper;
import com.project.entity.OrderItem;

import java.util.List;

public interface CartService {

    /**
     * add a new cart
     * @param cart
     * @return success return 1, fail return 0
     */
    int addCart(Cart cart);

    /**
     * find cart based on cartId
     * @param cartId
     * @return the cart entity
     */
    Cart findCartById(int cartId);


    /**
     * update cart total price after adding new orderItem
     * @param total price
     * @param cartId
     * @return success return 1, fail return 0
     */
    int updateCartTotalPrice(double total, int cartId);

    /**
     * get cart of the current loggedInUser
     * @return the CartWrapper entity
     */
    CartWrapper getCart();

    /**
     * find all the orderItems in the cart based on cartId
     * @param cartId
     * @return the list of orderItems
     */
    List<OrderItem> findOrderItemsByCartId(int cartId);

    /**
     * clean cart
     */
    void cleanCart();
}
