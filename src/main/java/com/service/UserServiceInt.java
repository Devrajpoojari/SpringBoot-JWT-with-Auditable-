package com.service;

import java.util.Optional;

import com.entity.User;
import com.exceptions.ResourceNotFoundException;

public interface UserServiceInt {

	public User addUser(User u) throws Exception;
	public User updateUser(int i,User u) throws ResourceNotFoundException;
	public String deleteUser(int i) throws ResourceNotFoundException;
	public Optional<User> getUserById(int i) throws ResourceNotFoundException;
	public User getUserByName(String name) throws ResourceNotFoundException;
}
