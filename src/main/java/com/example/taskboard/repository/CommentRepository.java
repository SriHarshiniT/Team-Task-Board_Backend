package com.example.taskboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskboard.dto.CommentDtos;
import com.example.taskboard.model.Comment;
import com.example.taskboard.model.Task;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    // return comments (not DTOs directly — projection is optional)
    List<Comment> findByTask_IdOrderByCreatedAsc(Long taskId);
}

