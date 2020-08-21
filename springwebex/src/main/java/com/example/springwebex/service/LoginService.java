package com.example.springwebex.service;

import java.util.List;

import com.example.springwebex.model.User;

public interface LoginService {

	public boolean validateUser(String username, String password, String purpose);

	public User save(User user);

	public List<User> getAllUserDetails();

	public int deleteUserDetailsById(Long id);

	
}
