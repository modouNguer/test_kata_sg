package com.example.kata_sg_modou.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)

  private String userId;
  private String nom;
  private String prenom;
  @Embedded  private Adresse userAdress;
  private long phoneNumber;
  private String emailAdress;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Adresse getUserAdress() {
    return userAdress;
  }


  public void setUserAdress(Adresse userAdress) {
    this.userAdress = userAdress;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmailAdress() {
    return emailAdress;
  }

  public void setEmailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
  }
}
