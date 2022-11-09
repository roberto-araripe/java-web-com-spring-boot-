package com.tadkey.java.web.com.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tadkey.java.web.com.spring.boot.entities.User;
import com.tadkey.java.web.com.spring.boot.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired 
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		List<User> result = repository.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}
	@PostMapping(value = "/{id}")
	public User insert(@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}
}
