package com.springDemo.service;

import com.springDemo.dao.StudentRepo;
import com.springDemo.dao.StudentRepositoryImpl;
import com.springDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }
    public Student getStudent(int id){
        return studentRepo.getReferenceById(id);
    }
    public Student submitDetails(Student student){
        return studentRepo.save(student);
    }

}
