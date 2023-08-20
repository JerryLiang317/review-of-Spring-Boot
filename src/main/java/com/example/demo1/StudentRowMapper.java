package com.example.demo1;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {

            //從資料庫中取得數據
            //Integer id = resultSet.getInt("id");
            //String name = resultSet.getString("name");

            //將數據轉為 Java object
            //Student student = new Student();
            //student.setId(id);
            //student.setName(name);

            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));

        return student;
    }
}
