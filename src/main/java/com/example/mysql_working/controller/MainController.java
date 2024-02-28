package com.example.mysql_working.controller;

import com.example.mysql_working.model.Student;
import com.example.mysql_working.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/test")
    public String testConnection() {
        return "Connection OK ok!";
    }
}