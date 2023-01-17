package com.exam.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = {"*"}, allowCredentials = "false", allowedHeaders = { "*" }, 
//exposedHeaders = { "*" },methods = {RequestMethod.GET, RequestMethod.DELETE, 
//		RequestMethod.POST, RequestMethod.PUT})
@RequestMapping("/user")

public class UserController {
	
	
	@Autowired
	private UserService userService;
	//creating user
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles=new HashSet<>();
		
		Role role=new Role();
		role.setRoleId(45L);
		role.setRoleName("Normal");
		
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		
		
		return this.userService.createUser(user, roles);	
	}
	
	// getting user by username
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	//deleting user by id
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		this.userService.deleteUser(userId);
	}
	

}
