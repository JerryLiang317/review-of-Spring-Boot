package com.example.demo1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/test1")
    public String test1(@RequestParam(defaultValue = "10") Integer id,
                        @RequestParam(required = false) String name){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        return "Hello test1";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Student student){
        System.out.println("Student id: " + student.getId());
        System.out.println("Student name: " + student.getName());
        return "Hello test2";
    }
}
