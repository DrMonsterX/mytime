package com.sxd.server.mytime.Controller.TaskController;

import com.sxd.server.mytime.Entity.Task;
import com.sxd.server.mytime.Service.TaskService.GetTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetTaskController {
    @Autowired
    private GetTaskService getTaskService;

    //获取对应userId的所有task
    @RequestMapping(value = "getAllTask",method = RequestMethod.GET)
    public List<Task> getAllTask(Integer userId){
        List<Task> list=new ArrayList<>();
        try {
            list=getTaskService.getAllTask(userId);
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }

    //获取对应userId，对应tag的所有task
    @RequestMapping(value = "getTaskByTag",method = RequestMethod.GET)
    public List<Task> getTestByTag(Integer userId,String tag){
        List<Task> list=new ArrayList<>();
        try{
            list=getTaskService.getTaskByTag(userId,tag);
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }

    //获取对应taskId的task
    @RequestMapping(value = "getTaskById",method = RequestMethod.GET)
    public Task getTaskById(Integer taskId){
        Task task=null;
        try{
            task=getTaskService.getTaskById(taskId);
        }catch (Exception e){
            System.out.println(e);
        }
        return task;
    }
}
