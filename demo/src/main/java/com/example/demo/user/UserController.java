package com.example.demo.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }


  @GetMapping("/users/{id}")
  public User getUser(@PathVariable String id) {
    return userService.getUser(id);
  }

  @PostMapping(value="/users", consumes="application/json", produces="application/json")
  public void addUser(@RequestBody User user) {
    userService.addUser(user);

  }

  @PutMapping(value="/users/{id}", consumes="application/json", produces="application/json")
  public void updateUser(@RequestBody User user, @PathVariable String id) {
    userService.updateUser(id, user);
  }

  @DeleteMapping("/users/{id}")
  public void deleteUser(@PathVariable String id) {
     userService.deleteUser(id);
  }




}



