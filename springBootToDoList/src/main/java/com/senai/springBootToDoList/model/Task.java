package com.senai.springBootToDoList.model;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter @Setter
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	@NotNull
	@Column(name = "title", length = 100)
	private String title;

	@NotBlank
	@NotNull
	@Column(name = "description", length = 300)
	private String description;
	
	@NotBlank
	@NotNull
	@Column(name = "priority", length = 10)
	private Integer priority;
	
	@ManyToAny
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User user;
	
	
}

