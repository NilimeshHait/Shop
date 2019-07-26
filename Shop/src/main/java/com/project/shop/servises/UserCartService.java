package com.project.shop.servises;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.shop.model.UserCart;
import com.project.shop.repositories.UserCartRepository;

@Service
public class UserCartService {
	
	private UserCartRepository userCartRepository;

	public UserCartService(UserCartRepository userCartRepository) {
		
		this.userCartRepository = userCartRepository;
	}
	
	public List<UserCart> getAllCartItems(){
		return (List<UserCart>) userCartRepository.findAll(); 	
	}
	
}
