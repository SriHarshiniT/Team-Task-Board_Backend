package com.example.taskboard.service;

import java.util.List;

import com.example.taskboard.dto.CommentDtos;
import com.example.taskboard.model.Comment;

public interface CommentService {

	List<CommentDtos> forTask(Long taskId);

	Comment addByID(Long taskId,Long UserId, String req);

}
