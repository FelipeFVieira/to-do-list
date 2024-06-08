package com.senai.springBootToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.springBootToDoList.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
