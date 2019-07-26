package com.project.shop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.shop.model.User;

public interface UserRepository extends CrudRepository<User, String>{

	
}
