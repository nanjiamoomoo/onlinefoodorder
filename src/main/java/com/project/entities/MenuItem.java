package com.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuItem implements Serializable {
    private Integer menuItemId;
    private String name;
    private Double price;
    private String description;
    private Integer restaurantId;
}
