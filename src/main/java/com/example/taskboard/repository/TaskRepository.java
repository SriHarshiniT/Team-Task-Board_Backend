package com.example.taskboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskboard.model.Comment;
import com.example.taskboard.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

	

}
