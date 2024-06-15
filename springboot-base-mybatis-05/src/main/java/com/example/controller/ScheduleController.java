package com.example.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.mappers.ScheduleMapper;
import com.example.pojo.Schedule;
import com.example.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author UserName
 */
@RestController
@RequestMapping("schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    
    @GetMapping
    public List<Schedule> delete(){
        scheduleService.delete(1);
        return null;
    }

    @Bean("dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DruidDataSource dataSource() {
            return new DruidDataSource();
    }
}