package com.example.demo1;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @PostMapping("/students")
    public String create(@RequestBody Student student){
       return "執行資料庫的 create 操作";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable Integer studentId){
        return "執行資料庫的 read 操作";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student){
        return "執行資料庫的 update 操作";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){
        return "執行資料庫的 delete 操作";
    }
}
