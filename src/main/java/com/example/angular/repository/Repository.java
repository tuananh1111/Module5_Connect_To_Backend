package com.example.angular.repository;

import java.util.List;

public interface Repository<T> {
    T findById(Long id);
    List<T> findAll();
    T save(T model);
    void remove(Long id);
}
