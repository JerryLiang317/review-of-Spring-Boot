package com.example.demo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.test1")
    public DataSource test1DataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public NamedParameterJdbcTemplate test1JdbcTemplate(
            @Qualifier("test1DataSource") DataSource datasource){
        return  new NamedParameterJdbcTemplate(datasource);
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.test2")
    public DataSource test2DataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    public NamedParameterJdbcTemplate test2JdbcTemplate(
            @Qualifier("test1DataSource") DataSource datasource){
        return  new NamedParameterJdbcTemplate(datasource);
    }
}
