package com.SringBootPractice.CrudDemo.dao;

import com.SringBootPractice.CrudDemo.entity.Student;

import java.util.List;

public interface StudentDAO {
     void save(Student theStudent);
     Student findById(Integer id);
     List<Student> findAll();
     List<Student>  findByLastName(String theLastName);
    void  update(Student thestudent);
    void delete (Integer id);

}
