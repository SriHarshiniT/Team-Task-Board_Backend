package com.example.taskboard.controller;

import com.example.taskboard.model.Task;
import com.example.taskboard.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "http://localhost:4200") // allow Angular frontend
public class TasksController {

	@Autowired
    private TaskService service;

  
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }


    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

   
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return service.getTaskById(id);
    }

    
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        return service.updateTask(id, taskDetails);
    }

    
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return "Task deleted successfully";
    }
}
