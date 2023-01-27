package com.example.kata_sg_modou.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kata_sg_modou.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {



}
