package com.project.test;

import com.project.entity.OrderItem;
import com.project.mapper.OrderItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:applicationContext.xml")
public class Test {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @org.junit.jupiter.api.Test
    public void testAddItem() {
        OrderItem orderItem = new OrderItem(null, 1, 13.99, 21, "农家小炒肉Stir Fried Pork with Pepper", 34);
        orderItemMapper.addOrderItem(orderItem);
    }
}
