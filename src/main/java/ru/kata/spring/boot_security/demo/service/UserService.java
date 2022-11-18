package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int id);

    User findByEmail(String email);

    void save(User user);

    void update(User user);

    void deleteById(int id);

    User passwordCoder(User user);

}
