package com.example.SpringHelloWorld.service;

import com.example.SpringHelloWorld.security.CustomUserDetails;
import com.example.SpringHelloWorld.entity.User;
import com.example.SpringHelloWorld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException("user with username [" +username + "] not found");

        return new CustomUserDetails(user);
    }
}
