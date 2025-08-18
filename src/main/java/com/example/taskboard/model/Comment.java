package com.example.taskboard.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@ManyToOne
	@JoinColumn(name = "task_id")
	private Task task;

	@ManyToOne 
	@JoinColumn(name = "author_id")
	private User author;

	private String body;
	private LocalDateTime created;
	public Comment() {
		super();
	}
	public Comment(Long id, Task task, User author, String body, LocalDateTime created) {
		super();
		this.id = id;
		this.task = task;
		this.author = author;
		this.body = body;
		this.created = created;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	
	
	

}
