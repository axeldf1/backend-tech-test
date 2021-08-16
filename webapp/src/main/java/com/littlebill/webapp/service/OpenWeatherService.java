package com.littlebill.webapp.service;

import com.littlebill.webapp.model.Weather;

import com.littlebill.webapp.repository.OpenWeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class OpenWeatherService {

    @Autowired
    private OpenWeatherRepository openWeatherService;

    public Weather GetWeatherByCity(String prefix) throws JSONException {
        String rawJson = openWeatherService.GetWeatherByCity(prefix);

        JSONObject root = new JSONObject(rawJson);

        System.out.println(root.getString("cod"));
        String averageTemp = root.getJSONObject("main").getString("temp");
        String minTemp = root.getJSONObject("main").getString("temp_min");
        String maxTemp = root.getJSONObject("main").getString("temp_max");

        String windSpeed = root.getJSONObject("wind").getString("speed");

        String city = root.getString("name");

        return new Weather(averageTemp, minTemp, maxTemp, windSpeed, city);
    }
}
