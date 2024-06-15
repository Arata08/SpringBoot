package com.example.mappers;

import com.example.pojo.Schedule;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author UserName
* @description 针对表【schedule】的数据库操作Mapper
* @createDate 2024-04-13 15:02:01
* @Entity com.example.pojo.Schedule
*/
@Repository
public interface ScheduleMapper {
    List<Schedule> queryAll();

    int delete(int i);
}