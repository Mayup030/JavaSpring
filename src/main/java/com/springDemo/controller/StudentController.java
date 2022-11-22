package com.springDemo.controller;

import com.springDemo.model.Student;
import com.springDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("submit")
    public Student submitDetails(@RequestBody Student student){
        return studentService.submitDetails(student);
    }

    @GetMapping("getStudent")
    public Student getStudent(@RequestParam int id){
        return studentService.getStudent(id);
    }
}
