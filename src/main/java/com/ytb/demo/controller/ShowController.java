package com.ytb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ytb.demo.pojo.User;
import com.ytb.demo.service.IUserService;

@Controller
@RequestMapping("/show")
public class ShowController {
	
	@Autowired
	private IUserService userService;

	@GetMapping()
	public String showUsers(Model model) {
		
		List<User> userList = userService.getAll();
		model.addAttribute("userList", userList);
		
		return "user";
	}
	
}
