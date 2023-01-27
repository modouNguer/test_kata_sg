package com.example.kata_sg_modou.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.kata_sg_modou.entities.Card;

public interface CardRepository extends JpaRepository<Card, Long>{
  //@Query("SELECT c FROM Card c inner join Account a on c.id= a.listOfCardsAssociatedWithThisAccount.")


}
