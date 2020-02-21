package com.aciworldwide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aciworldwide.entities.User;
import com.aciworldwide.services.UserService;


//Presentation layer - Request processing component of spring web MVC
@Controller
public class LoginController {
	
	//Used to invoke business layer
	@Autowired
	private UserService userService;
	
	
	//Request processing method
	@RequestMapping("/signin") //handler mapping -  to map request URL with request processing method
	public String validateUser(User user, ModelMap map) {
		
		//invoking business logic method of business layer(Service) 
		if(userService.isValidUser(user)) {
			map.addAttribute("uname",user.getUsername());
//			return "success.html"; //'Success' is the logical view name ("success.jsp")
			return "success";
		}
		else {
			map.addAttribute("logonerror", "Invalid username/passowrd");
//			return "error.html"; //("error.jsp")
			return "login";
		}
	}
}
