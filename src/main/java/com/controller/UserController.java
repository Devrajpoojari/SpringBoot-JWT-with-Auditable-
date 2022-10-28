package com.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.exceptions.ResourceNotFoundException;
import com.repo.UserRepo;
import com.service.UserServiceInt;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserServiceInt serviceInt;

	@GetMapping(path = "/getUser/{id}")
	public ResponseEntity<Optional<User>> getUser(@PathVariable(value = "id") int id) throws ResourceNotFoundException {
		Optional<User> u = serviceInt.getUserById(id);
		return ResponseEntity.ok(u);
	}

	@PostMapping(path = "/addUser")
	public ResponseEntity<User> addUser(@RequestBody User u) throws Exception {
		User uu = serviceInt.addUser(u);
		return ResponseEntity.ok(uu);
	}

	@PutMapping(path = "/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") int id, @RequestBody User u)
			throws ResourceNotFoundException {
		User uu = serviceInt.updateUser(id, u);
		return ResponseEntity.ok(uu);
	}

	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) throws ResourceNotFoundException {
		String s = serviceInt.deleteUser(id);
		return ResponseEntity.ok(s);
	}

	@GetMapping("getListOfUsers")
	public ResponseEntity<List<User>> getListOfUsers() {
		List list = userRepo.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("getByName/{name}")
	public ResponseEntity<User> getByName(@PathVariable String name) throws ResourceNotFoundException {
		User u = serviceInt.getUserByName(name);
		return ResponseEntity.ok(u);
	}
}
