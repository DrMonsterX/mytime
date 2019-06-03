package com.sxd.server.mytime.Controller.TaskController;

import com.sxd.server.mytime.Entity.Task;
import com.sxd.server.mytime.Service.TaskService.GetTaskService;
import com.sxd.server.mytime.Service.TaskService.ModifyTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinishTaskController {
    @Autowired
    private ModifyTaskService modifyTaskService;
    @Autowired
    private GetTaskService getTaskService;

    //修改任务完成信息
    @RequestMapping(value = "finishTask",method = RequestMethod.GET)
    public int finishTask(Integer taskId,Integer finishNum){
        Task task=null;
        try{
            task=getTaskService.getTaskById(taskId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(task==null){
            return -2;
        }
        task.setIsComplete(finishNum);
        int result=-1;
        try{
            result=modifyTaskService.modifyTask(task);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
