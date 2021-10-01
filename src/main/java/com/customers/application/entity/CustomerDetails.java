package com.customers.application.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userName;
    private String address;
    private String email;
    private String createdOn;
    private String lastLogin;

}
