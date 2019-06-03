package com.sxd.server.mytime.Service.TaskService;

import com.sxd.server.mytime.Dao.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteTaskService {
    @Autowired
    private TaskMapper taskMapper;

    public int deleteTask(Integer taskId)throws Exception{
        return taskMapper.deleteByPrimaryKey(taskId);
    }
}
