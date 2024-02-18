package com.example.mysql_working.repository;

import com.example.mysql_working.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
