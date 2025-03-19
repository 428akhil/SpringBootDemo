package com.Akhilesh.SimpleWebApp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    static String login(){
        return " login page..";
    }

    @RequestMapping("/logout")
    static String logout(){
        return " logout page..";
    }
}
