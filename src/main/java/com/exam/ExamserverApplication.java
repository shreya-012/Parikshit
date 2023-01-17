package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");	
		
//		User user=new User();
//		user.setFirstName("Shreya");
//		user.setLastName("Somani");
//		user.setUsername("shreya08");
//		user.setPassword("shreya123");
//		user.setEmail("shreyasomani812@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("Admin");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}

}
