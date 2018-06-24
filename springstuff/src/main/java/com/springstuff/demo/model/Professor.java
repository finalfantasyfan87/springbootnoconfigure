package com.springstuff.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int professorId;
	
	private int departmentId;
	private String name;
	private int courseId;
	
	
	
	
	

}
