package com.example.taskboard.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskboard.dto.CommentDtos;
import com.example.taskboard.model.Comment;
import com.example.taskboard.model.User;
import com.example.taskboard.repository.UserRepository;
import com.example.taskboard.service.CommentService;

@RestController
@RequestMapping("/comments")
@CrossOrigin(origins = "http://localhost:4200")
public class CommentsController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/task/{taskId}")
    public List<CommentDtos> forTask(@PathVariable Long taskId) {
        return commentService.forTask(taskId);
    }

    @PostMapping("/task/{taskId}/user/{userId}")
    public Comment add(@PathVariable Long taskId,
                       @PathVariable Long userId,
                       @RequestBody String req) {
        return commentService.addByID(taskId, userId, req);
    }


}
