package com.kateh.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kateh.cloud.study.entity.User;
import com.kateh.cloud.study.repository.UserRepository;

import java.util.Optional;

@RestController
public class UserController {
  @Autowired
  private UserRepository userRepository;

  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    User user = this.userRepository.findById(id).get();
    return user;
  }
}
