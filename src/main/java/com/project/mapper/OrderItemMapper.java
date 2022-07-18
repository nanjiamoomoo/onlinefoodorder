package com.project.mapper;

import com.project.entity.OrderItem;

public interface OrderItemMapper {
    /**
     * add orderItem entity into database
     * @param orderItem
     * @return success return 1, fail return 0
     */
    int addOrderItem (OrderItem orderItem);

    /**
     * remove all the orderItems with the specific cartId
     * @param cartId
     */
    void removeAllOrderItemsWithCartId(int cartId);
}
