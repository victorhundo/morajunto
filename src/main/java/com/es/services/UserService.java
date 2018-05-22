package com.es.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.es.models.User;


public interface UserService {
	
	User create(User user);

	List<User> findAll();

	User getById(String id);
	
	User login(String email);

	boolean update(User newUser);

	void delete(User user);

	User getByEmail(String email);

}
