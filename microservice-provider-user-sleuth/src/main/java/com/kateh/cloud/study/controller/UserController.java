package com.kateh.cloud.study.controller;

import com.kateh.cloud.study.entity.Name;
import com.kateh.cloud.study.repository.NameRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcOperationsDependsOnPostProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kateh.cloud.study.entity.User;
import com.kateh.cloud.study.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class UserController {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private NameRepository nameRepository;

  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    User user = this.userRepository.findById(id).get();
    return user;
  }

  @GetMapping("/callname")
  public User findRandomUser() {
    long totalCount = this.userRepository.count();
    long randomUserId = (long) (Math.random() * totalCount) + 1;
    User user = this.userRepository.findById(randomUserId).get();
    Integer gender = user.getGender();
    List<Name> nameList = this.nameRepository.findByGender(gender);
    user.setName(nameList.get(new Random().nextInt(nameList.size())).getName());
    return user;
  }
}
