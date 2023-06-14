package com.example.StudentReg.repository;

import com.example.StudentReg.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface StudentRepository extends MongoRepository<Student,String> {
}