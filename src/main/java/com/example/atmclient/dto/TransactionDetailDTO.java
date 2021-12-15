package com.example.atmclient.dto;



import java.math.BigDecimal;

public class TransactionDetailDTO {


  private BigDecimal amount;


  private TransactionType transactionType;

  private String cardNumber;
  private BigDecimal balance;



  public TransactionDetailDTO() {
  }

  public TransactionDetailDTO( BigDecimal amount,  TransactionType transactionType,  String cardNumber,  BigDecimal balance) {
    this.amount = amount;
    this.transactionType = transactionType;
    this.cardNumber = cardNumber;
    this.balance = balance;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}
