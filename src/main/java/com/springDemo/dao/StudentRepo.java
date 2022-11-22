package com.springDemo.dao;

import com.springDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    List<Student> findAll();
    Student getReferenceById(int id);
    Student save(Student student);
}
