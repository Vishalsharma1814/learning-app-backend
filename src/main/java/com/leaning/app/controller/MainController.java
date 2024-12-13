package com.leaning.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping
    public String test(){
        return "App Working";
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
