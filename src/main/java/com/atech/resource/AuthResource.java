package com.atech.resource;

import java.security.Principal;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AuthResource { 
	
	@RequestMapping("/user")
    public Principal getCurrentLoggedInUser(Principal user) {		
        return user;
    }
}
