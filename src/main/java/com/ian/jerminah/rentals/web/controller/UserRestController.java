package com.ian.jerminah.rentals.web.controller;

import com.ian.jerminah.rentals.domain.User;
import com.ian.jerminah.rentals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    private final UserService userService;

    @Autowired
    public UserRestController(UserService a) {
        this.userService = a;
    }

    @PostMapping("/register")
    ResponseEntity<User> addUser(@RequestBody User a){
        userService.register(a);
        return new ResponseEntity<>(a, HttpStatus.ACCEPTED);
    }

    @PostMapping("/login")
    ResponseEntity<Boolean> loginUser(@RequestParam String email,@RequestParam String password){
        return new ResponseEntity<>(userService.login(email,password),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{email}")
    ResponseEntity<User> deleteUser(@RequestBody User a){
        userService.delete(a);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
}