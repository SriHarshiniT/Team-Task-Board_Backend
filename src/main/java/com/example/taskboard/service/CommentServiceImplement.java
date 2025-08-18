package com.example.taskboard.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskboard.dto.CommentDtos;
import com.example.taskboard.model.Comment;
import com.example.taskboard.model.Task;
import com.example.taskboard.model.User;
import com.example.taskboard.repository.CommentRepository;
import com.example.taskboard.repository.TaskRepository;
import com.example.taskboard.repository.UserRepository;

@Service
public class CommentServiceImplement implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<CommentDtos> forTask(Long taskId) {
        return commentRepository.findByTask_IdOrderByCreatedAsc(taskId)
                .stream()
                .map(c -> new CommentDtos(
                        c.getId(),
                        c.getTask().getId(),
                        c.getAuthor().getId(),
                        c.getBody(),
                        c.getCreated()
                ))
                .toList();
    }

    @Override
    public Comment addByID(Long taskId, Long userId, String req) {
        Task t = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + taskId));

        User a = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));

        Comment c = new Comment();
        c.setTask(t);
        c.setAuthor(a);
        c.setBody(req);
        c.setCreated(LocalDateTime.now());

        return commentRepository.save(c);
    }

}
