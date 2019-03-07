package com.sun.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.shop.model.User;
import com.sun.shop.repository.jpa.UserRepository;

@Controller
@RequestMapping(path = "/shop")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "getAllUsers")
	@ResponseBody
	public Iterable<User> getAllUsers() {

		return userRepository.findAll();

	}
}
