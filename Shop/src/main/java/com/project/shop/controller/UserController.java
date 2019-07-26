package com.project.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shop.model.User;
import com.project.shop.servises.UserService;

@RestController
@RequestMapping("/shop")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class UserController {
	
	
	private UserService userService;

	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public List<User> getAllUserDetails(){
		
		List<User> userList=null;
		
		userList=(List<User>) userService.getAllUserDetails();
		return userList;
	}
	
	@GetMapping("/user/{userId}")
	public User getAllUserDetails(@PathVariable String userId){
		
		User user=null;
		
		user= userService.getUserDetails(userId);
		return user;
	}
	@DeleteMapping("/user/{userId}")
	public boolean deletedUser(@PathVariable String userId) {
		boolean isDeleted=false;
		isDeleted=userService.deleteUser(userId);
		return isDeleted;
		
	}
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		User user1=null;
		user1=userService.createUser(user);
		return user1;
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		User user1=null;
		user1=userService.updateUser(user1);
		return user1;
	}
}
