package com.authentication.auth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String helloUser() {
        return "welcome to spring JWT";
    }
    @GetMapping ("/signup")
    public String helloAdmin() {
        return "welcome to spring boot JWT";
    }
}

