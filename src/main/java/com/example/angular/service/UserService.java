package com.example.angular.service;

import com.example.angular.model.User;

import java.util.List;

public interface UserService<T> {
    T findById(Long id);
    List<T> findAll();
    void remove(Long id);
    T save(T t);

}
