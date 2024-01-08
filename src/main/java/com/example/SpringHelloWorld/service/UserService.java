package com.example.SpringHelloWorld.service;

import com.example.SpringHelloWorld.entity.User;
import com.example.SpringHelloWorld.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    public User get(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User update(User updatedUser) {
        return userRepository.save(updatedUser);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }
}
