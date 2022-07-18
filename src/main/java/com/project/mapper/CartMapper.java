package com.project.mapper;

import com.project.entity.Cart;
import com.project.entity.OrderItem;

import java.util.List;


public interface CartMapper {

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
     * find all the orderItems in the cart based on cartId
     * @param cartId
     * @return the list of orderItems
     */
    List<OrderItem> findOrderItemsByCartId(int cartId);

}
