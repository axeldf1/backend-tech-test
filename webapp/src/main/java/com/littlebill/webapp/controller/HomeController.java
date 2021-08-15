package com.littlebill.webapp.controller;

import com.littlebill.webapp.security.appUser.AppUser;
import com.littlebill.webapp.security.registration.RegistrationRequest;
import com.littlebill.webapp.service.CatFactService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Controller
public class HomeController {

    @Autowired
    private CatFactService _catFactService;

    private AppUser _user;

    @GetMapping("/")
    public String GetHome(Model model) {
        model.addAttribute("catFact", _catFactService.GetCatFact());
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
