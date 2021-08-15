package com.littlebill.webapp.controller;

import com.littlebill.webapp.model.User;
import com.littlebill.webapp.repository.UserRepository;
import com.littlebill.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserRepository _userRepository;

    @Autowired
    private UserService _userService;

    @PostMapping("/saveUser")
    public ModelAndView saveEmployee(@ModelAttribute User user) {
        _userRepository.save(user);
        return new ModelAndView("auth");
    }

    @PostMapping("/loginUser")
    public String Login(@ModelAttribute User user){
        if(_userService.CheckLogin(user.getPseudo(), user.getPassword()))
            return "redirect:/home";
        else
            return "auth";
    }

    @GetMapping("/loginUser")
    public String t(Model model){
        model.addAttribute("user", new User());
        return "auth";
    }

}
