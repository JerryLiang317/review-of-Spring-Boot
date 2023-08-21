package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TwoStudentController {

    @Autowired
    @Qualifier("test1JdbcTemplate")
    private NamedParameterJdbcTemplate test1JdbcTemplate;

    @Autowired
    @Qualifier("test2JdbcTemplate")
    private NamedParameterJdbcTemplate test2JdbcTemplate;

    @PostMapping("/test1/students")
    public String test1Insert(@RequestBody TwoStudent twoStudent){
        String sql = "INSERT INTO twostudent(name) VALUE (:twostudentName)";

        Map<String, Object> map = new HashMap<>();
        map.put("twostudentName", twoStudent.getName());

        test1JdbcTemplate.update(sql, map);

        return "插入數據到 test1 資料庫";
    }

    @PostMapping("/test2/students")
    public String test2Insert(@RequestBody TwoStudent twoStudent){
        String sql = "INSERT INTO twostudent(name) VALUE (:twostudentName)";

        Map<String, Object> map = new HashMap<>();
        map.put("twostudentName", twoStudent.getName());

        test1JdbcTemplate.update(sql, map);

        return "插入數據到 test1 資料庫";
    }
}
