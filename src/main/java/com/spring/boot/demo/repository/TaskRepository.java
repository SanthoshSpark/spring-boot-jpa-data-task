package com.spring.boot.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.demo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

	
}
