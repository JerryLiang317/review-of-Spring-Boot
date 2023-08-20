package com.example.demo1.dao;

import com.example.demo1.model.Student;

import java.util.List;

public interface StudentDao {

    Student getById(Integer studentId);

    void insertStudent(Student student);

    void insertStudents(List<Student> studentList);

    void deleteById(Integer studentId);
}
