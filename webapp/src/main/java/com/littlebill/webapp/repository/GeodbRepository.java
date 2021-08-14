package com.littlebill.webapp.repository;

import com.littlebill.webapp.CustomProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class GeodbRepository {

    @Autowired
    private CustomProperties _properties;

    public String GetCitiesByPrefix(String prefix, int limit){
        String _baseURL = _properties.getGeodbUrl(), _endPoint = "cities?limit=" + limit + "&offset=0&namePrefix=" + prefix;
        String _complete = _baseURL + _endPoint;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(
                _complete,
                HttpMethod.GET,
                null,
                String.class
        );
        return response.getBody();
    }

    public String GetCountriesByPrefix(String prefix, int limit){
        String _baseURL = _properties.getGeodbUrl(), _endPoint = "countries?limit=" + limit + "&offset=0&namePrefix=" + prefix;
        String _complete = _baseURL + _endPoint;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(
                _complete,
                HttpMethod.GET,
                null,
                String.class
        );
        return response.getBody();
    }
}
