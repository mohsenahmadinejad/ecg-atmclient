package com.example.atmclient.service;


import com.example.atmclient.AtmclientApplication;
import com.example.atmclient.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AuthenticateUserService {

  @Autowired
  private RestTemplate restTemplate;


  public String getToken() {
    UserDto userDto=new UserDto();
    userDto.setUserName("user1");
    userDto.setPassword("pwd1");

    String token=restTemplate.postForObject(AtmclientApplication.atmServer+"/authenticate",userDto,String.class);
    return token;
  }

}
