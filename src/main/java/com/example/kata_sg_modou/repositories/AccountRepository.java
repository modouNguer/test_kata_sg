package com.example.kata_sg_modou.repositories;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.kata_sg_modou.entities.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {




}
