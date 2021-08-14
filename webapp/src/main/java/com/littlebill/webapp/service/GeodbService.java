package com.littlebill.webapp.service;

import com.littlebill.webapp.repository.CatFactRepository;
import com.littlebill.webapp.repository.GeodbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeodbService {

    @Autowired
    private GeodbRepository _geodbRepository;

    public List<String> GetCitiesByPrefix(String prefix, int limit) throws JSONException {
        String rawJson =  _geodbRepository.GetCitiesByPrefix(prefix, limit);

        JSONObject root = new JSONObject(rawJson);

        JSONArray cities = root.getJSONArray("data");

        List<String> allCities = new ArrayList<String>();

        for(int i = 0; i < cities.length(); i++) {
            // the JSON data
            JSONObject jsonPlant = cities.getJSONObject(i);
            // Plant object that we will populate from JSON data.
            String city = jsonPlant.getString("city");

            allCities.add(city);
        }

        return allCities;
    }

    public List<String> GetCountriesByPrefix(String prefix, int limit) throws JSONException {
        String rawJson =  _geodbRepository.GetCountriesByPrefix(prefix, limit);

        JSONObject root = new JSONObject(rawJson);

        JSONArray countries = root.getJSONArray("data");

        List<String> allCountries = new ArrayList<String>();

        for(int i = 0; i < countries.length(); i++) {
            // the JSON data
            JSONObject jsonPlant = countries.getJSONObject(i);
            // Plant object that we will populate from JSON data.
            String city = jsonPlant.getString("name");

            allCountries.add(city);
        }

        return allCountries;
    }
}
