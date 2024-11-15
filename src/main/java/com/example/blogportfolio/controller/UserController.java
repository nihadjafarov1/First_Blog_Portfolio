package com.example.blogportfolio.controller;

import com.example.blogportfolio.model.User;
import com.example.blogportfolio.service.UserServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserServiceA userServiceA;

    @GetMapping
    public List<User> getAllUsers() {
        return userServiceA.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userServiceA.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userServiceA.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userServiceA.updateUser(id, userDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userServiceA.deleteUser(id);
    }
}
