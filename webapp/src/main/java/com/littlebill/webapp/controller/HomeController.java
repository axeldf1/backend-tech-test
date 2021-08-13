package com.littlebill.webapp.controller;

import com.littlebill.webapp.service.CatFactService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Controller
public class HomeController {

    @Autowired
    private CatFactService _catFactService;

    @GetMapping("/")
    public String GetHome(Model model) throws JSONException {
        model.addAttribute("catFact", _catFactService.GetCatFact());
        return "home";
    }
}
