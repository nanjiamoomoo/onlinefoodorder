package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem implements Serializable {
    private String orderItemId;
    private Integer quantity;
    private Double price;
    private Integer menuItemId;
    private Integer cartId;
}
