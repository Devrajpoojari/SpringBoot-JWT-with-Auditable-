package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.entity.User;

class UserServiceImplTest {
	
	@Autowired
	private UserServiceInt userServiceInt;
	
	@Test
	public void addUser() throws Exception
	{
		User u=new User();
		u.setName("s");
		u.setUserId(90);
		assertEquals(u, userServiceInt.addUser(u));
	}
}
