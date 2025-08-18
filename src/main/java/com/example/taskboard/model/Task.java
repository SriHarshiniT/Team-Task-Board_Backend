package com.example.taskboard.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String title;
	private String description;
	private String priority;
	
	@ManyToOne
	@JoinColumn(name = "assignee_id")
	private User assignee;
	private String status;
	private LocalDateTime dueDate;
	private LocalDateTime created;
	private LocalDateTime updated;
	public Task() {
		super();
	}
	
	
	public Task(Long id, String title, String description, String priority, User assignee, String status,
			LocalDateTime dueDate, LocalDateTime created, LocalDateTime updated) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.assignee = assignee;
		this.status = status;
		this.dueDate = dueDate;
		this.created = created;
		this.updated = updated;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public User getAssignee() {
		return assignee;
	}
	public void setAssignee(User assignee) {
		this.assignee = assignee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getUpdated() {
		return updated;
	}
	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	} 
	
	
	

}
