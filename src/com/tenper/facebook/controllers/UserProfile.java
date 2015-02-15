package com.tenper.facebook.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserProfile {
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
