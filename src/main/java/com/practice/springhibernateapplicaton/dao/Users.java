package com.practice.springhibernateapplicaton.dao;

import lombok.Data;

@Data
public class Users {
    private int userId;
    private String userName;
    private String address;
    private String email;
    private String createdOn;
    private String lastLogin;
}
