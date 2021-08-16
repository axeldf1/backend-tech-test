package com.littlebill.webapp.controller;

import com.littlebill.webapp.security.appUser.AppUser;
import com.littlebill.webapp.security.registration.RegistrationRequest;
import com.littlebill.webapp.service.CatFactService;
import com.littlebill.webapp.service.GeodbService;
import com.littlebill.webapp.service.OpenWeatherService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Data
@Controller
public class HomeController {

    @Autowired
    private CatFactService _catFactService;

    @Autowired
    private OpenWeatherService openWeatherService;

    @Autowired
    private GeodbService geodbService;

    private AppUser _user;

    @GetMapping("/")
    public String GetHome(Model model, @RequestParam(required = false) String city, @RequestParam(required = false) String lucky) throws JSONException {
        model.addAttribute("catFact", _catFactService.GetCatFact());
        if(city != null)
            model.addAttribute("weather", openWeatherService.GetWeatherByCity(city));
        if(lucky != null)
        {
            city = geodbService.GetLucky();
            model.addAttribute("weather", openWeatherService.GetWeatherByCity(city));
        }
        return "home";
    }

    @GetMapping("/register")
    public String GetRegister(Model model) {
        model.addAttribute("appUser", new RegistrationRequest("","","",""));
        return "register";
    }

    @GetMapping("/login")
    public String GetAuth() {
        return "auth";
    }



}
