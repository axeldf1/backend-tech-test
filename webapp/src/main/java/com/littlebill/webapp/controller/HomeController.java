package com.littlebill.webapp.controller;

import com.littlebill.webapp.model.User;
import com.littlebill.webapp.service.CatFactService;
import com.littlebill.webapp.service.UserService;
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
    private UserService _userService;

    private User _user;

    @GetMapping("/home")
    public String GetHome(Model model) {
        model.addAttribute("catFact", _catFactService.GetCatFact());
        return "home";
    }

    @GetMapping("/register")
    public String GetRegister(Model model) {
        model.addAttribute("user", _user);
        return "registerPage";
    }

    @GetMapping("/")
    public String GetAuth(Model model) {
        model.addAttribute("user", _user);
        return "authPage";
    }



}
