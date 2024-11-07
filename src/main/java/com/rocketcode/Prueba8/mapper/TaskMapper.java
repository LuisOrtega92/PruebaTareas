package com.rocketcode.Prueba8.mapper;

import com.rocketcode.Prueba8.model.Task;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface TaskMapper {
    void insertTask(Task task);
    List<Task> getAllTasks();
}