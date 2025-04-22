package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/req/login")
    public String login() {
        return "login";  //This refers to 'login.html' in 'src/main/resources/templates'
    }

    @GetMapping("/req/signup")
    public String signup() {
        return "signup";  //refers to 'signup.html' in 'src/main/resources/templates'
    }
    @GetMapping("/index")
    public String home() {
        return "index";  //refers to 'index.html' in 'src/main/resources/templates'
    }
    @GetMapping("/2-tracker")
    public String tracker() {
        return "2-tracker";  //refers to 'index.html' in 'src/main/resources/templates'
    }
    @GetMapping("/3-scheduling")
    public String scheduling() {
        return "3-scheduling";  //refers to 'index.html' in 'src/main/resources/templates'
    }
    @GetMapping("/4-page")
    public String page() {
        return "4-page";  //refers to 'index.html' in 'src/main/resources/templates'
    }
    @GetMapping("/5-page")
    public String page2() {
        return "5-page";  //refers to 'index.html' in 'src/main/resources/templates'
    }
    @GetMapping("/6-profile")
    public String profile() {
        return "6-profile";  //refers to 'index.html' in 'src/main/resources/templates'
    }
}
