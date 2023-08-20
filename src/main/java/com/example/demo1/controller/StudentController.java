package com.example.demo1.controller;

import com.example.demo1.model.Student;
import com.example.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public String insert(@RequestBody Student student){
        studentService.insertStudent(student);

        return "執行 INSERT sql";
    }

    @PostMapping("/students/batch")
    public String insertList(@RequestBody List<Student> studentList){
        studentService.insertStudents(studentList);

        return "執行一批 INSERT sql";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){
        studentService.deleteById(studentId);

        return "執行 DELETE sql";
    }

    @GetMapping("/students/{studentId}")
    public Student select(@PathVariable Integer studentId){
        return studentService.getById(studentId);
    }
}
