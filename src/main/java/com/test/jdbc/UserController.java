package com.test.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/createUser")
	public void createUser(String name, Integer age){
		userService.createUser(name, age);
	}

	
	@RequestMapping("/test")
	public String test(){
		return "were";
	}
	
}
