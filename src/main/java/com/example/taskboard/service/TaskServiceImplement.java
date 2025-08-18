package com.example.taskboard.service;

import com.example.taskboard.model.*;
import com.example.taskboard.repository.TaskRepository;
import com.example.taskboard.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskServiceImplement implements TaskService{

	@Autowired
    private TaskRepository taskRepository;
	
	@Autowired
	private UserRepository userRepository;

    // CREATE
    public Task createTask(Task task) {
    		if(task.getAssignee().getId()!=null)
    		{
    			userRepository.findById(task.getAssignee().getId())
                .ifPresent(task::setAssignee);
    		}
    		task.setCreated(LocalDateTime.now());
    		task.setUpdated(null);
    		task.setDueDate(LocalDateTime.now().plusDays(2));
        return taskRepository.save(task);
    }

    // READ all
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // READ by ID
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    // UPDATE
    public Task updateTask(Long id, Task taskDetails) {
        Task existing = taskRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTitle(taskDetails.getTitle());
            existing.setDescription(taskDetails.getDescription());
            existing.setPriority(taskDetails.getPriority());
            existing.setAssignee(taskDetails.getAssignee());
            existing.setStatus(taskDetails.getStatus());
            existing.setDueDate(taskDetails.getDueDate());
            return taskRepository.save(existing);
        }
        return null;
    }

    // DELETE
    public void deleteTask(Long id) {
    	taskRepository.deleteById(id);
    }
}
