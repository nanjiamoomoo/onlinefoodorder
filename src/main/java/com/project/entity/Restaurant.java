package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant implements Serializable {
    private Integer RestaurantId;
    private String address;
    private String name;
    private String phone;
    private String ImageUrl;
}
