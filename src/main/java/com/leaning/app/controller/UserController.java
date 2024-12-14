package com.leaning.app.controller;

import com.leaning.app.entity.User;
import com.leaning.app.repository.UserRepository;
import com.leaning.app.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.verify(user);
//        var u = userRepository.findByUsername(user.getUsername());
//        if (Objects.isNull(u)) {
//            return "failure";
//        } else {
//            return "success";
//        }
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}
