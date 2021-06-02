package com.divinexcode.ecommerce.auth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/oauth2")
public class SocialOAuth2Controller {
	
	@GetMapping("/google")
	private String googleOAuth2() {
		return "Welcome to Google !!";	
	}
	
	@GetMapping("/user")
	private Principal user(Principal principal) {
		System.out.println("username : "+principal.getName());
		return principal;	
	}

}
