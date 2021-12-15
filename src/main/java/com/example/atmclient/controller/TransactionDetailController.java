package com.example.atmclient.controller;


import com.example.atmclient.dto.TransactionDetailDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Please think about other possible operations.
 */

public interface TransactionDetailController {


  @PostMapping("/transaction")
  TransactionDetailDTO addTransaction(@RequestBody TransactionDetailDTO transactionDetailDTO);
}
