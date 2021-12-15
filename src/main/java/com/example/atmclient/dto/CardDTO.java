package com.example.atmclient.dto;


import java.math.BigDecimal;

public class CardDTO {


  private String cardNumber;

  private String password;

  private BigDecimal balance;

  private int failedAttempt;

  private Boolean enabled;


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public int getFailedAttempt() {
    return failedAttempt;
  }

  public void setFailedAttempt(int failedAttempt) {
    this.failedAttempt = failedAttempt;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
}
