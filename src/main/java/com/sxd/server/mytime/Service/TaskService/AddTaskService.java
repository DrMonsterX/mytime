package com.sxd.server.mytime.Service.TaskService;


import com.sxd.server.mytime.Dao.TaskMapper;
import com.sxd.server.mytime.Entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddTaskService {
    @Autowired
    private TaskMapper taskMapper;

    public int addTask(Task task)throws Exception{
        return taskMapper.insert(task);
    }

}
