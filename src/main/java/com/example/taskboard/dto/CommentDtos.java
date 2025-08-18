package com.example.taskboard.dto;


import java.time.LocalDateTime;

public record CommentDtos(
        Long id,
        Long taskId,
        Long authorId,
        String body,
        LocalDateTime created
) {}


