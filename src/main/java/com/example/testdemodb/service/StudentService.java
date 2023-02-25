/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.testdemodb.service;

import com.example.testdemodb.data.Student;
import com.example.testdemodb.data.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ramesh
 */

@Service
public class StudentService {

//in the runtime spring identify this class and set object using Dipendency Injection method
    @Autowired
    private StudentRepository stuRepo;
    
    public List<Student> getAllStudent(){
        List<Student> students = stuRepo.findAll();     //find all student details and assigned to list students
        return students;
    }
    
    //find one user by id
    public Student getStudentByID(int id){
        Optional<Student> stu = stuRepo.findById(id);
        return stu.get();
    }
    
    //create student
    public Student createStudent(Student stu){
        return stuRepo.save(stu);
    }
}
