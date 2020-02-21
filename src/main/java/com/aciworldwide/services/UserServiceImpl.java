package com.aciworldwide.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;
import com.aciworldwide.repositories.UserRepository;

//Business Layer Interface implementor class - Model Class
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	// Business logic method implementation
	@Override
	public boolean isValidUser(User user) {
		User dbUser = userRepository.findByUsername(user.getUsername());

		// Business logic
		if (dbUser != null && user.getPassword().equals(dbUser.getPassword()))
			return true;
		else
			return false;
	}

}
