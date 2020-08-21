package com.example.springwebex.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwebex.model.User;
import com.example.springwebex.repository.UserRepository;
import com.example.springwebex.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserRepository userRepository;

	public boolean validateUser(String username, String password, String purpose) {
		System.out.println("Entering - LoginServiceImpl.validateUser(String, String, String) - username : "+username+" | password : "+password+" | purpose : "+purpose);
		boolean validUser = false;
		User user = userRepository.validateUser(username, password, purpose);
		if(user != null){
			validUser = true;
		}
		return validUser;
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUserDetails() {
		return userRepository.findAll();
	}

	public int deleteUserDetailsById(Long id) {
		return userRepository.deleteUserDetailsById(id);
	}
	

}
