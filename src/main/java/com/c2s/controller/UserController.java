package com.c2s.controller;

import com.c2s.transfer.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String loginPage(Model model) {
        System.out.println("loginPage");
        User u = new User();
        model.addAttribute("user", u);
        return "login";
    }

    @RequestMapping("/register")
    public String registerPage(Model model) {
        System.out.println("register");
        User u = new User();
        model.addAttribute("user", u);
        return "register";
    }

    @RequestMapping("/resetPassword")
    public String resetPasswordPage(Model model) {
        System.out.println("resetPassword");
        User u = new User();
        model.addAttribute("user", u);
        return "resetPassword";
    }

    @PostMapping(value = "/signIn")
    public String signIn(@ModelAttribute("user") User user ){
        System.out.println("PST!");
        System.out.println(user);
        return "index";
    }

    @PostMapping(value = "/registerUser")
    public String registrar(@ModelAttribute("user") User user ){
        System.out.println("PST!");
        System.out.println(user);
        return "register";
    }

    @PostMapping(value = "/resetPass")
    public String resetPassword(@ModelAttribute("user") User user ){
        System.out.println("resetPass!");
        System.out.println(user);
        return "resetPassword";
    }

}