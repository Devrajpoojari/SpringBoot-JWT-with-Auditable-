package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.exceptions.ResourceNotFoundException;
import com.repo.UserRepo;

@Service
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public User addUser(User u) throws Exception {
		User u1=userRepo.getUserByName(u.getName());
		User uu;
		if(u1==null)
		{
			u.setUserId(u.getUserId());
			u.setName(u.getName());
			u.setPassword(getEncodedPassword(u.getPassword()));
	      uu = userRepo.save(u);
		}
		else
		{
			throw new Exception(u.getName()+" Already Exist");
		}
		return uu;
	}

	@Override
	public User updateUser(int i, User u) throws ResourceNotFoundException {
		User b= userRepo.findById(i)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + i));
		User uu1=null;
		if (b != null) {
			u.setUserId(u.getUserId());
			u.setName(u.getName());
			uu1 = userRepo.save(u);
		}
		return uu1;
	}

	@Override
	public String deleteUser(int i) throws ResourceNotFoundException {
		User b= userRepo.findById(i)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + i));
		userRepo.deleteById(i);
		return "User Deletd ";
	}

	@Override
	public Optional<User> getUserById(int i) throws ResourceNotFoundException

	{
		User b= userRepo.findById(i)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + i));
		Optional<User> u = userRepo.findById(i);

		return u;
	}

	@Override
	public User getUserByName(String name) throws ResourceNotFoundException {
		User b= userRepo.getUserByName(name);
		User u=null;
		if(b!=null)
		{
		
		 u = userRepo.getUserByName(name);
		}
		else
		{
			throw new ResourceNotFoundException("User is not Found int Db "+ name);
		}
		return u;
	}

	public String getEncodedPassword(String str)
	{
		return encoder.encode(str);
	}
	
}
