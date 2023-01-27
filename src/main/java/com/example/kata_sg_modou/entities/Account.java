package com.example.kata_sg_modou.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Account {


  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long accountNumber;
  @OneToMany(mappedBy = "account",cascade = CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = true)
  private List<Card> listOfCardsAssociatedWithThisAccount = new ArrayList<>();
  @OneToOne
  @JoinColumn( name="idUserInformations", nullable=false )
  private User user ;
  private double balance;
  private String opertationType;

  public Account() {
  }


  public long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Collection<Card> getListOfCardsAssociatedWithThisAccount() {
    return listOfCardsAssociatedWithThisAccount;
  }

  public void setListOfCardsAssociatedWithThisAccount(List<Card> listOfCardsAssociatedWithThisAccount) {
    this.listOfCardsAssociatedWithThisAccount = listOfCardsAssociatedWithThisAccount;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}
