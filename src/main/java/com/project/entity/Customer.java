package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Integer cartId;
}
