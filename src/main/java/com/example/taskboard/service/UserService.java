package com.example.taskboard.service;

import java.util.List;

import com.example.taskboard.model.User;

public interface UserService {

	List<User> usersRepositorygetUsersList();

	User userRepositorycurrentUser(Long id);

	User createUser(User user);
	

}
