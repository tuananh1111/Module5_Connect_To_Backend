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
    private Long numberPhone;
    private String email;

    public User(Long id, String name, Long numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public User(String name, Long numberPhone, String email) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public User() {
    }
}
