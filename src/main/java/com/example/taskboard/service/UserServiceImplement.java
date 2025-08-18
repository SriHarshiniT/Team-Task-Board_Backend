package com.example.taskboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskboard.model.User;
import com.example.taskboard.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User userRepositorycurrentUser(Long Id) {
		// TODO Auto-generated method stub
		return userRepository.findEmailById(Id);
	}

	@Override
	public List<User> usersRepositorygetUsersList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
