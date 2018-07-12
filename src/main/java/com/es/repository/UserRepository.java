package com.es.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.es.models.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	public User findByUsername(String username);
	
	

}
