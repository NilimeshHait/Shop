package com.project.shop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.shop.model.Items;

public interface ItemRepository extends CrudRepository<Items, Integer>{

	

}
