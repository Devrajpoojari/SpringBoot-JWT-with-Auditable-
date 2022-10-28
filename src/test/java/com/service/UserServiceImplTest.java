package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

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
		
		List l= new ArrayList();
		User u=new User();
		u.setName("s");
		u.setUserId(90);
		assertEquals(l, l);
	}
}
