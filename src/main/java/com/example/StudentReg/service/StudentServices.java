package com.example.StudentReg.service;

import com.example.StudentReg.entity.Student;
import com.example.StudentReg.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class StudentServices {
 
    @Autowired
    private StudentRepository repo;
 
    public void save(Student students) {
 
        repo.save(students);
    }
 
    public Iterable<Student> listAll() {
 
        return this.repo.findAll();
    }
 
 
}