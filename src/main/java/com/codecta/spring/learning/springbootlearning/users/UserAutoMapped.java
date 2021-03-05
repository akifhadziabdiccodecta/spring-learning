package com.codecta.spring.learning.springbootlearning.users;

import lombok.Data;

@Data
public class UserAutoMapped {
    private Long id;
    private String firstName;
    private String lastName;
    private String personalId;
    private String username;
}
