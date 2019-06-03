package com.sxd.server.mytime.Service.TaskService;

import com.sxd.server.mytime.Dao.TaskMapper;
import com.sxd.server.mytime.Entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class GetTaskService {
    @Autowired
    private TaskMapper taskMapper;

    //获取对应userid的所有task
    public List<Task> getAllTask(Integer userId)throws Exception{
        Example example=new Example(Task.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("userId",userId);
        return taskMapper.selectByExample(example);
    }

    //获取对应userId，对应tag的所有task
    public List<Task> getTaskByTag(Integer userId,String tag)throws Exception{
        Example example=new Example(Task.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("userId",userId);
        criteria.andEqualTo("tag",tag);
        return taskMapper.selectByExample(example);
    }

    //获取对应taskId的task
    public Task getTaskById(Integer taskId)throws Exception{
        return taskMapper.selectByPrimaryKey(taskId);
    }
}
