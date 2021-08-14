package com.littlebill.webapp.controller;

import com.littlebill.webapp.service.GeodbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GeodbController {

    @Autowired
    private GeodbService _geodbService;

    @GetMapping(value = "/cityNamesAutocomplete")
    @ResponseBody
    public List<String> cityNamesAutocomplete(@RequestParam(value = "term", required = false, defaultValue = "") String term) {
        List<String> allCities = new ArrayList<>();
        try {
            if (term.length() >= 3) {
                allCities = _geodbService.GetCitiesByPrefix(term, 10);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return allCities;
    }

    @GetMapping(value = "/countryNamesAutocomplete")
    @ResponseBody
    public List<String> countryNamesAutocomplete(@RequestParam(value = "term", required = false, defaultValue = "") String term) {
        List<String> allCountries = new ArrayList<>();
        try {
            if (term.length() >= 1) {
                allCountries = _geodbService.GetCountriesByPrefix(term, 10);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return allCountries;
    }
}
