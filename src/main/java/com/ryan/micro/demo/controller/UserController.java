package com.ryan.micro.demo.controller;

import com.ryan.micro.demo.entity.User;
import com.ryan.micro.demo.repository.UserRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Resource
    private UserRepository userRepository;

    @GetMapping(value = "/demo")
    public User demo() {
        User user = new User();
        user.setUserId("james");
        user.setRealityName("James.K.John");
        return userRepository.save(user);
    }
}
