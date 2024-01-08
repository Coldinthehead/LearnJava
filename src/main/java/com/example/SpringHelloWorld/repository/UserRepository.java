package com.example.SpringHelloWorld.repository;

import com.example.SpringHelloWorld.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
