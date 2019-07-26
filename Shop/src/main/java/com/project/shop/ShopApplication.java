package com.project.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.shop.model.CartPrimaryKey;
import com.project.shop.model.Items;
import com.project.shop.model.User;
import com.project.shop.model.UserCart;
import com.project.shop.repositories.ItemRepository;
import com.project.shop.repositories.UserCartRepository;
import com.project.shop.repositories.UserRepository;

@SpringBootApplication
public class ShopApplication  {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemRepository itemsRepository;
//	
	@Autowired
	private UserCartRepository userCartRepository;
//	
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}
	
	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * User user=new User(123, "nilimesh", "123654", "0124578", new
	 * Date("10/04/2018"), 0); User user1=new User(124, "nilimesh hait", "123655",
	 * "0124578", new Date("10/04/2018"), 0); //User user1=new User(101,
	 * "nilimesh1", "00000", "0124978", new Date("10/05/2018"), 0);
	 * userRepository.save(user); userRepository.save(user1);
	 * 
	 * // UserCart userCart1=new UserCart(123); // UserCart userCart2=new
	 * UserCart(101); // Items item=new Items("apple", "fruit", 10, 30, 1); Items
	 * item3=new Items("A", "B", 10, 30, 1); Items item4=new Items("B", "A", 30, 50,
	 * 1); itemsRepository.save(item); itemsRepository.save(item3);
	 * itemsRepository.save(item4);
	 * 
	 * CartPrimaryKey cartPrimaryKey=new CartPrimaryKey("123", 2); CartPrimaryKey
	 * cartPrimaryKey1=new CartPrimaryKey("123", 1);
	 * 
	 * Items itemsDetails=new Items(); Items itemsDetails1=new Items();
	 * itemsDetails=itemsRepository.findById(1).get();
	 * itemsDetails1=itemsRepository.findById(2).get();
	 * 
	 * UserCart userCart=new
	 * UserCart(cartPrimaryKey1,5,itemsDetails.getItem_name(),itemsDetails.getPrice(
	 * )*5); UserCart userCart1=new
	 * UserCart(cartPrimaryKey,2,itemsDetails1.getItem_name(),itemsDetails1.getPrice
	 * ()*2); userCartRepository.save(userCart); userCartRepository.save(userCart1);
	 * // Items item2=new Items("bag", "stationary", 30, 50, 1, userCart1); // //
	 * Items item3=new Items("A", "B", 10, 30, 1, userCart2); // Items item4=new
	 * Items("B", "A", 30, 50, 1, userCart2); // // // userCart1.setCart_items(new
	 * HashSet<Items>() {{ // add(item); // add(item2); // }}); // //
	 * userCart2.setCart_items(new HashSet<Items>() {{ // add(item3); // add(item4);
	 * // }}); // // userRepository.save(user); // userRepository.save(user1); // //
	 * userCartRepository.save(userCart1); // userCartRepository.save(userCart2); //
	 * // List<Items> itemss=new ArrayList<>(); // itemss.add(item); // //
	 * itemss.add(item2); itemss.add(item3); itemss.add(item4); //
	 * //System.out.println(userCartRepository.findAllByuser_id(123)); }
	 */
}
