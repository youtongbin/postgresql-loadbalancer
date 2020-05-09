package com.ytb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ytb.demo.pojo.User;
import com.ytb.demo.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable(value = "id") Integer id) {
		
		return userService.getUser(id);
	}
	
	@GetMapping
	public List<User> getAll() {
		
		return userService.getAll();
	}
	
	@PostMapping
	public Boolean addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@PutMapping
	public Boolean updateUser(@RequestBody User user) {
		
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public Boolean deleteUser(@PathVariable("id") Integer id) {
		
		return userService.deleteUser(id);
	}
	
	@DeleteMapping("/slave/{id}")
	public Boolean deleteUserSlave(@PathVariable("id") Integer id) {
		
		return userService.deleteUserSlave(id);
	}
}
