package com.Akhilesh.SimpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "welcome to new website";
    }

    @RequestMapping("/about")
    public String about(){
        return "we are new!";
    }

}
