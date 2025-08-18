package com.example.taskboard.service;

import java.util.List;

import com.example.taskboard.model.Task;

public interface TaskService {

	Task createTask(Task task);

	List<Task> getAllTasks();

	Task getTaskById(Long id);

	Task updateTask(Long id, Task taskDetails);

	void deleteTask(Long id);

}
