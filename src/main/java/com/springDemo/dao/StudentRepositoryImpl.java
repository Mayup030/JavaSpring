package com.springDemo.dao;

import com.springDemo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


public class StudentRepositoryImpl {
    public List<Student> getAllStudent(){
        //select * from student;
        return null;
    }
    public Student getStudent(String id){
        System.out.println("Id is ...."+ id);
        Student student = new Student();
        //select * from student where id = student.getId();
        return null;
    }
}
