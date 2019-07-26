package com.project.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shop.model.UserCart;
import com.project.shop.servises.UserCartService;

@RestController
@RequestMapping("/shop")
public class UserCartController {
	
	private UserCartService userCartService;

	public UserCartController(UserCartService userCartService) {
		
		this.userCartService = userCartService;
	}
	
	@GetMapping("/orders")
	public List<UserCart> getAllUsesOrder(){
		
		return userCartService.getAllCartItems();
		
	}
	
}
