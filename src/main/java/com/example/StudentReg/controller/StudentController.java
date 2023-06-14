package com.example.StudentReg.controller;

import com.example.StudentReg.entity.Student;
import com.example.StudentReg.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {
 
    @Autowired
    private StudentServices studentServices;
 
    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody Student students) {
 
        studentServices.save(students);
        return students.get_id();
    }
    
    @GetMapping(value = "/getall")
    public Iterable<Student> getStudents() {
        return studentServices.listAll();
    }

 
}