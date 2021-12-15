package com.example.atmclient.controller;


import com.example.atmclient.AtmclientApplication;
import com.example.atmclient.dto.CardDTO;
import com.example.atmclient.dto.TransactionDetailDTO;
import com.example.atmclient.service.AuthenticateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TransactionDetailControllerImpl implements TransactionDetailController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private AuthenticateUserService authenticateUserService;

  @Override
  public TransactionDetailDTO addTransaction(TransactionDetailDTO transactionDetailDTO) {

      String token=authenticateUserService.getToken();
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      headers.add("Authorization", "Bearer " + token);
      HttpEntity<TransactionDetailDTO> request = new HttpEntity<TransactionDetailDTO>(transactionDetailDTO,headers);
      Map<String, String> params1 = new HashMap<>();
      ResponseEntity<TransactionDetailDTO> result=restTemplate.exchange(AtmclientApplication.atmServer+"/transaction", HttpMethod.POST,request,TransactionDetailDTO.class,params1);

      //      TransactionDetailDTO dto=restTemplate.postForObject("http://localhost:8080/transaction",transactionDetailDTO,TransactionDetailDTO.class);

      return result.getBody();


     }


}
