package com.example.kata_sg_modou.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Card {
  @Id   @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private long idCardNumber;
  private int  cardPassWord;
  private int cvcCard;
  private boolean isGhost;
  @ManyToOne( cascade = CascadeType.ALL )
  @JoinColumn( name="accountNumber" )
  private Account account;






  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdCardNumber() {
    return idCardNumber;
  }

  public void setIdCardNumber(long idCardNumber) {
    this.idCardNumber = idCardNumber;
  }

  public int getCardPassWord() {
    return cardPassWord;
  }

  public void setCardPassWord(int cardPassWord) {
    this.cardPassWord = cardPassWord;
  }

  public int getCvcCard() {
    return cvcCard;
  }

  public void setCvcCard(int cvcCard) {
    this.cvcCard = cvcCard;
  }

  public boolean isGhost() {
    return isGhost;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public void setGhost(boolean ghost) {
    isGhost = ghost;
  }
}
