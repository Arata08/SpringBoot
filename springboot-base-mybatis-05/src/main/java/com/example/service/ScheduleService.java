package com.example.service;

import com.example.mappers.ScheduleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ChenXing
 * 2024/4/13 下午4:12
 * describe：
 */
@Service
public class ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Transactional
    public void delete(int id){
        int rows = scheduleMapper.delete(id);
        System.out.println("rows = " + rows);
//        int i = 1/0;
    }
}
