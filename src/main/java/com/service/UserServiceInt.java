package com.service;

import java.util.Optional;

import com.entity.User;

public interface UserServiceInt {

	public User addUser(User u);
	public User updateUser(int i,User u);
	public String deleteUser(int i);
	public Optional<User> getUserById(int i);
}
