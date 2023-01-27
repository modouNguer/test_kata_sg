package com.example.kata_sg_modou.services;

import static java.util.stream.Collectors.toList;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kata_sg_modou.entities.Account;
import com.example.kata_sg_modou.entities.Card;
import com.example.kata_sg_modou.entities.User;
import com.example.kata_sg_modou.repositories.AccountRepository;
import com.example.kata_sg_modou.repositories.CardRepository;
import com.example.kata_sg_modou.repositories.UserRepository;


@Service
public class AccountService implements AccountServiceImpl,UserServiceImpl{
  @Autowired private AccountRepository accountOperation;
  @Autowired private UserRepository userRepository;
  @Autowired private CardRepository cardRepository;
  @Override
  public void saveMoney(double amount, Card bankCard) {

    Optional<Account> myAccount = findById(1L);

    if (myAccount.isPresent()) {
      if (!checkCards(myAccount.get()).isEmpty()) {

        var myCurrentBalance = myAccount.get().getBalance();
        var newBalance = myCurrentBalance + amount;
        updateBalance(myAccount.get().getAccountNumber(), newBalance);

      }

    }
  }


  @Override
  public Optional<Account> findById(long accountId) {
    return accountOperation.findById(accountId);
  }


  @Override
  public void updateBalance(long accountId, double balance) {
    var userAccount = accountOperation.findById(accountId);
    if(userAccount.isPresent()){
      accountOperation.save(new Account(accountId,balance,"Retrait"));

    }

  }

  @Override
  public void retrieveMoney(double money,Card userBankCar) {

    Optional<Card> userBankCard=  cardRepository.findById(1L);

    if (userBankCard.isPresent()){
      var myCurrentBalance=userBankCard.get().getAccount().getBalance();
       if(myCurrentBalance>=money){
         System.out.println("Vous avez retirez "+money);
         myCurrentBalance = myCurrentBalance-money;
         updateBalance(userBankCard.get().getAccount().getAccountNumber(),myCurrentBalance);
       }else {
         System.out.println("Votre solde est insuffisant ");

       }

    }
  }

  @Override
  public void checkBalanceOfMyAccount(Card userCard) {
    Optional<Card> userBankCard=  cardRepository.findById(userCard.getIdCardNumber());
   if(userBankCard.isPresent()){
     System.out.println("Ton solde est de :"+userBankCard.get().getAccount().getBalance());
   }else {

     System.out.println("Ce compte n'hexiste pas :");

   }
  }

  @Override
  public Optional<User> findUser(long userId) {
    return userRepository.findById(userId);
  }

  private List<Card> checkCards(Account account) {

    List<Card> cardList = new java.util.ArrayList<>(Collections.emptyList());

      var listOfCards =account
          .getListOfCardsAssociatedWithThisAccount();

      cardList
          .addAll(listOfCards
          .stream()
          .filter(Card::isGhost)
          .toList());

    return cardList;
  }
}
