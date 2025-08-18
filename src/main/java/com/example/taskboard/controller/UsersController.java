package com.example.taskboard.controller;

import com.example.taskboard.dto.UserDTO;
import com.example.taskboard.model.User;
import com.example.taskboard.repository.UserRepository;
import com.example.taskboard.service.UserService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")

public class UsersController {
	
	@Autowired
    private UserService userService;

    @GetMapping
    public List<User> list() {
    	
    	return userService.usersRepositorygetUsersList();
        //return usersRpoRepository.findAll();
    }

    @GetMapping("/{Id}")
    public User me(@PathVariable Long Id) {
    	return userService.userRepositorycurrentUser(Id);
        //return usersRpoRepository.findByEmail(user.getEmail());
    }
    
    @PostMapping
    public User createUser(@RequestBody User user)
    {
    	return userService.createUser(user);
    }
}
