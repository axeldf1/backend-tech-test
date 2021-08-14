package com.littlebill.webapp.repository;

import com.littlebill.webapp.CustomProperties;
import com.littlebill.webapp.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class UserRepository {

    @Autowired
    private CustomProperties _properties;

    public User GetUserAuth(){
        String baseUrl = _properties.getApiUrl();
        String endPoint = "";
        String completeUrl = baseUrl + endPoint;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> response = restTemplate.exchange(
                completeUrl,
                HttpMethod.GET,
                null,
                User.class
        );
        return response.getBody();
    }
}
