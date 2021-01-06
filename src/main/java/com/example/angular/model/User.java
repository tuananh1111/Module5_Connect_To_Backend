package com.example.angular.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long number_phone;
    private String email;

    public User(Long id, String name, Long number_phone, String email) {
        this.id = id;
        this.name = name;
        this.number_phone = number_phone;
        this.email = email;
    }

    public User(String name, Long number_phone, String email) {
        this.name = name;
        this.number_phone = number_phone;
        this.email = email;
    }

    public User() {
    }
}
