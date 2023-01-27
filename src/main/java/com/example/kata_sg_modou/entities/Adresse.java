package com.example.kata_sg_modou.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {
  private String city;
  private long zipCode;
  private String country;



  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public long getZipCode() {
    return zipCode;
  }

  public void setZipCode(long zipCode) {
    this.zipCode = zipCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
