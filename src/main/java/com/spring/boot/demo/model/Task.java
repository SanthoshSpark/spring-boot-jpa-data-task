package com.spring.boot.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id")
	private long id;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "completed", nullable = false)
	private String completed;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(long id, String description, String completed) {
		super();
		this.id = id;
		this.description = description;
		this.completed = completed;
	}

	public Task(String description, String completed) {
		super();
		this.description = description;
		this.completed = completed;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String isCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", completed=" + completed + "]";
	}
	
	
	
}
