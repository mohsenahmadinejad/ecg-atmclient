package com.example.atmclient;

import com.example.atmclient.service.AuthenticateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AtmclientApplication implements CommandLineRunner {

    public static final String atmServer="http://localhost:8080";


    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(AtmclientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
