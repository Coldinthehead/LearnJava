package com.example.SpringHelloWorld.web;

import com.example.SpringHelloWorld.entity.User;
import com.example.SpringHelloWorld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<Iterable<User>> get() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        User user = userService.get(id);
        if (user == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/add")
    public ResponseEntity<User> create(@RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User updatedUser) {
        if (userService.findById(id) == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        updatedUser.setId(id);
        return new ResponseEntity<>(userService.save(updatedUser), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> delete(@PathVariable Integer id) {
        User user = userService.findById(id);
        if (user == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        userService.delete(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
