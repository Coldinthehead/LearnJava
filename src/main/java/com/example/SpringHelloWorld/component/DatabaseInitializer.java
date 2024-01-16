package com.example.SpringHelloWorld.component;

import com.example.SpringHelloWorld.entity.User;
import com.example.SpringHelloWorld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseInitializer {

    @Autowired
    private UserService userService;


    @EventListener(ApplicationReadyEvent.class)
    private void createRootIfNoUsers() {
        if (userService.getAll().isEmpty()) {
            userService.create("root", "root");
        }
    }
}
