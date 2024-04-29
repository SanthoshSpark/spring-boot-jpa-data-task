package com.spring.boot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.demo.model.Task;
import com.spring.boot.demo.repository.TaskRepository;

@Service
public class TaskService {

	
	private final TaskRepository taskRepository;
	
	@Autowired
	public TaskService(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	public List<Task> getAllTasks(){
		return taskRepository.findAll();
	}
	
	public Task getTaskById(Long id) {
		return taskRepository.findById(id).orElseThrow(null);
	}
	
	public Task createTask(Task task) {
		return taskRepository.save(task);
	}
	
	public Task updateTask(Task task) {
        Task existingTask = getTaskById(task.getId());
        existingTask.setDescription(task.getDescription());
        existingTask.setCompleted(task.isCompleted());
        return taskRepository.save(existingTask);
    }
	
	public void deleteTask(Long id) {
		taskRepository.deleteById(id);
	}

	
}
