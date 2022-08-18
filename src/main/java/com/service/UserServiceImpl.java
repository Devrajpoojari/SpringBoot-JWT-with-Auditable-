package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repo.UserRepo;
@Service
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	private UserRepo userRepo;

	@Override
	public User addUser(User u) {
		User uu = userRepo.save(u);
		return uu;
	}

	@Override
	public User updateUser(int i, User u) {
		Optional<User> uu = userRepo.findById(i);
		if (uu != null) {
			u.setUserId(u.getUserId());
			u.setName(u.getName());
		}
		User uu1 = userRepo.save(u);
		return uu1;
	}

	@Override
	public String deleteUser(int i) {
		userRepo.deleteById(i);
		return "User Deletd ";
	}

	@Override
	public Optional<User> getUserById(int i)

	{
		Optional<User> u = userRepo.findById(i);

		return u;
	}

}
