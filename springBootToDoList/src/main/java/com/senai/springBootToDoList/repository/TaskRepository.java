package com.senai.springBootToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.springBootToDoList.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
