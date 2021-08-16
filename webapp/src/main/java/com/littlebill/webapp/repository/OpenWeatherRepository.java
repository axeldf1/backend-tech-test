package com.littlebill.webapp.repository;

import com.littlebill.webapp.CustomProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class OpenWeatherRepository {

    @Autowired
    private CustomProperties _properties;

    public String GetWeatherByCity(String prefix) {
        String _baseURL = _properties.getOpenWeather(), _endPoint = "q=" + prefix + "&appid=264f91191c70b903711364d1165da172&units=metric";
        String _complete = _baseURL + _endPoint;

        System.out.println(_complete);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(
                _complete,
                HttpMethod.GET,
                null,
                String.class
        );

        return  response.getBody();
    }
}
