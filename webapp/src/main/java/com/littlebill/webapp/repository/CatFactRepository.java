package com.littlebill.webapp.repository;

import com.littlebill.webapp.CustomProperties;
import com.littlebill.webapp.model.Cat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class CatFactRepository {
    @Autowired
    private CustomProperties _properties;

    public Cat GetRandomFact(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Cat> response = restTemplate.exchange(
                _properties.getApiCatFact(),
                HttpMethod.GET,
                null,
                Cat.class
        );
        return response.getBody();
    }
}
