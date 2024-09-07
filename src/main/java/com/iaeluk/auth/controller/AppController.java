package com.iaeluk.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/public")
    public String getPublicMessage() {
        return "Public message is here!!!";
    }

    @GetMapping("/private")
    public String getPrivateMessage() {
        return "Private message is here!!!";
    }
}
