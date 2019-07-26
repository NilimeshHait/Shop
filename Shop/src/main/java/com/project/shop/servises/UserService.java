package com.project.shop.servises;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.shop.model.User;
import com.project.shop.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	public List<User> getAllUserDetails(){
		
		List<User> userList=null;
		
		userList=(List<User>) userRepository.findAll();
		return userList;
	}
	
	public User getUserDetails(String userId){
		
		User user=null;
		
		user= userRepository.findById(userId).get();
		return user;
	}
	
	public boolean deleteUser(String userId) {
		//boolean isDeleted=false;
		userRepository.deleteById(userId);
		return true;
		
	}
	
	
	public User createUser(User user) {
		User user1=null;
		user1=userRepository.save(user);
		return user1;
	}
	
	public User updateUser(User user) {
		User user1=null;
		user1=userRepository.save(user);
		return user1;
	}
}
