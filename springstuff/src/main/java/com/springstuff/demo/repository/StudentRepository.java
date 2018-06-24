package com.springstuff.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springstuff.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
