package com.example.demo1.service;

import com.example.demo1.model.Student;
import com.example.demo1.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getById(Integer studentId) {
        return studentDao.getById(studentId);
    }

    @Override
    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    @Override
    public void insertStudents(List<Student> studentList) {
        studentDao.insertStudents(studentList);
    }

    @Override
    public void deleteById(Integer studentId) {
        studentDao.deleteById(studentId);
    }
}
