package com.example.taskboard.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;



@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String Name;
	private String email;
	private String password;
	
	public User() {
		super();
	}
	
	public User(Long id, String name, String email, String password) {
		super();
		Id = id;
		Name = name;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
