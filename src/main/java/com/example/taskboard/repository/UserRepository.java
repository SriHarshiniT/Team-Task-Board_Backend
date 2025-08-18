package com.example.taskboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskboard.dto.UserDTO;
import com.example.taskboard.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findEmailById(Long Id);

}
