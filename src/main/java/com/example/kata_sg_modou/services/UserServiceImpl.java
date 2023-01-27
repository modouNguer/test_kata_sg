package com.example.kata_sg_modou.services;

import java.util.Optional;

import com.example.kata_sg_modou.entities.User;

public interface UserServiceImpl {

  Optional<User> findUser(long userId);


}
