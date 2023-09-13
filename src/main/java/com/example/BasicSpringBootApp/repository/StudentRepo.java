package com.example.BasicSpringBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BasicSpringBootApp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
}
