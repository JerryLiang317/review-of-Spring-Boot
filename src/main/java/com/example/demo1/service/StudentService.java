package com.example.demo1.service;

import com.example.demo1.model.Student;

import java.util.List;

public interface StudentService {

    Student getById(Integer studentId);

    void insertStudent(Student student);

    void insertStudents(List<Student> studentList);

    void deleteById(Integer studentId);
}
