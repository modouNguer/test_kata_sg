package com.example.kata_sg_modou.services;

import java.util.Optional;

import com.example.kata_sg_modou.entities.Account;
import com.example.kata_sg_modou.entities.Card;

public interface AccountServiceImpl {

  void saveMoney(double amount, Card bankCardUser);
  void retrieveMoney(double money,Card userBankCard);
  void checkBalanceOfMyAccount(Card card);
  Optional<Account> findById(long accountId);
  void updateBalance(long accountId, double balance);


}
