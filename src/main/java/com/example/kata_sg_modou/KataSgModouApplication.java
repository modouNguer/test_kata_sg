package com.example.kata_sg_modou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class KataSgModouApplication {


  public static void main(String[] args) {
    SpringApplication.run(KataSgModouApplication.class, args);
  }

}
