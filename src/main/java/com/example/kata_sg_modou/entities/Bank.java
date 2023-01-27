package com.example.kata_sg_modou.entities;

import java.util.Collection;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
  @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int bankId;
  private String bankName;
  @Embedded private Adresse adresse;
  @OneToMany private Collection<Account> accounts;

  public int getBankId() {
    return bankId;
  }


  public void setBankId(int bankId) {
    this.bankId = bankId;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Adresse getAdresse() {
    return adresse;
  }

  public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
  }

  public Collection<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(Collection<Account> accounts) {
    this.accounts = accounts;
  }
}
