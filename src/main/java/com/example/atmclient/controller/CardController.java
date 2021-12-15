package com.example.atmclient.controller;



import com.example.atmclient.dto.CardDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;

/**
 * Please think about other possible operations.
 */
public interface CardController {


  @GetMapping("/getBalance/{cardNumber}")
  BigDecimal getBalance(@PathVariable("cardNumber") String cardNumber);

  @PostMapping("/card")
  CardDTO addCard(@RequestBody CardDTO cardDTO);
}
