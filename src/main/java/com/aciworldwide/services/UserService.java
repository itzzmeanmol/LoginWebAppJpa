package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;


//Business layer interface - Model Interface

public interface UserService {
	
	//Business logic methods
	boolean isValidUser(User user);
}
