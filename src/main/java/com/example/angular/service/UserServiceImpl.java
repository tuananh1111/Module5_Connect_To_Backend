package com.example.angular.service;

import com.example.angular.model.User;
import com.example.angular.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService<User> {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void remove(Long id) {
        userRepository.remove(id);
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }
}
