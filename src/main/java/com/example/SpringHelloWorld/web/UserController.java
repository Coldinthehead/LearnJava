package com.example.SpringHelloWorld.web;

import com.example.SpringHelloWorld.dto.UserDTO;
import com.example.SpringHelloWorld.entity.User;
import com.example.SpringHelloWorld.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/users")
@PreAuthorize("isAuthenticated()")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<UserDTO>> get() {
        List<UserDTO> users =
                userService.getAll().stream()
                        .map(user -> modelMapper.map(user, UserDTO.class)).toList();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> get(@PathVariable Integer id) {
        User user = userService.get(id);
        if (user == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(modelMapper.map(user, UserDTO.class), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User user) {
        User savedUser = userService.save(user);
        return new ResponseEntity<>(modelMapper.map(savedUser, UserDTO.class), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody User updatedUser) {
        final User user = userService.update(updatedUser);
        if (user == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(modelMapper.map(user, UserDTO.class), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        User user = userService.findById(id);
        if (user == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        userService.delete(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
