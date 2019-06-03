package com.sxd.server.mytime.Controller.TaskController;

import com.sxd.server.mytime.Entity.Task;
import com.sxd.server.mytime.Service.TaskService.GetTaskService;
import com.sxd.server.mytime.Service.TaskService.ModifyTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResortTaskController {
    @Autowired
    private ModifyTaskService modifyTaskService;
    @Autowired
    private GetTaskService getTaskService;

    //对任务进行重新排序
    @RequestMapping(value = "resortTask",method = RequestMethod.GET)
    public int resortTask(Integer taskId,Integer position){
        Task task=null;
        try {
            task=getTaskService.getTaskById(taskId);
        }catch (Exception e){
            System.out.println(e);
        }
        int result=-1;
        if(task==null){
            return -2;
        }
        task.setPosition(position);
        try {
            result=modifyTaskService.modifyTask(task);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
