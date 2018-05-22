package com.es.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.models.User;
import com.es.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		userRepository = this.userRepository;
	}
	
	
	
	@Override
	public User create(User user) {
		return  userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User getById(String id) {
		return null;
	}

	@Override
	public boolean update(User newUser) {
		if (userRepository.existsById(newUser.getId())) {
			userRepository.save(newUser);
		}
		return false;
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
		
	}

	

	@Override
	public User login(String email) {
		userRepository.findById(email);
		return null;
	}



	@Override
	public User getByEmail(String email) {
		userRepository.findByEmail(email);
		return null;
	}

	

}
