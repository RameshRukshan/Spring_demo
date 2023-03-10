/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.testdemodb.controller;

import com.example.testdemodb.data.Student;
import com.example.testdemodb.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ramesh
 */

@RestController
public class StudentController {
    
    @Autowired
    private StudentService stuService;
    
    @GetMapping(path = "/students")         //set path to get all the student details
    public List<Student> getAllStudents(){
        return stuService.getAllStudent();
    }
    
    @GetMapping(path = "/students/get_by_id={id}")        //set path to get student details by using ID
    public Student getStudentByID(@PathVariable int id){
        return stuService.getStudentByID(id);
    }
    
    @PostMapping(path = "/students")
    public Student createStudent(@RequestBody Student stu){
        return stuService.createStudent(stu); 
    }
    
    @PutMapping(path = "/students")
    public Student updateStudent(@RequestBody Student stu){
        return stuService.createStudent(stu); 
    }
    
    @DeleteMapping(path = "/students/{id}") 
    public void deleteStudent(@PathVariable int id){
        stuService.deleteStudentByID(id);
    }
}
