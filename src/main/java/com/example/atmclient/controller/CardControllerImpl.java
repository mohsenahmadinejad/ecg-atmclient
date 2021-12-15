package com.example.atmclient.controller;


import com.example.atmclient.AtmclientApplication;
import com.example.atmclient.dto.CardDTO;
import com.example.atmclient.service.AuthenticateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CardControllerImpl implements CardController {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private AuthenticateUserService authenticateUserService;


  @Override
  public BigDecimal getBalance(String cardNumber) {

    String token=authenticateUserService.getToken();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.add("Authorization", "Bearer " + token);
    HttpEntity<String> request = new HttpEntity<String>(headers);
    Map<String, String> params1 = new HashMap<>();
    ResponseEntity<BigDecimal> balance=restTemplate.exchange(AtmclientApplication.atmServer+"/getBalance/user1", HttpMethod.GET,request,BigDecimal.class,params1);
//    BigDecimal balance=restTemplate.getForObject("http://localhost:8080/getBalance/1",BigDecimal.class);
    return balance.getBody();
  }

  @Override
  public CardDTO addCard(CardDTO cardDTO) {

    String token=authenticateUserService.getToken();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.add("Authorization", "Bearer " + token);
    HttpEntity<CardDTO> request = new HttpEntity<CardDTO>(cardDTO,headers);
    Map<String, String> params1 = new HashMap<>();
    ResponseEntity<CardDTO> result=restTemplate.exchange(AtmclientApplication.atmServer+"/card", HttpMethod.POST,request,CardDTO.class,params1);


//    CardDTO dto=restTemplate.postForObject("http://localhost:8080/card",cardDTO,CardDTO.class);
    return result.getBody();

  }


}
