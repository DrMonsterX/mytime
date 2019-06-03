package com.sxd.server.mytime.Controller.TaskController;

import com.sxd.server.mytime.Entity.Task;
import com.sxd.server.mytime.Service.TaskService.GetTaskService;
import com.sxd.server.mytime.Service.TaskService.ModifyTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyTaskController {
    @Autowired
    private ModifyTaskService modifyTaskService;
    @Autowired
    private GetTaskService getTaskService;

    //修改任务,返回结果状态码
    @RequestMapping(value = "modifyTask",method = RequestMethod.GET)
    public int modifyTask(Integer taskId,String taskName,String startTime,String stopTime,Integer remind,String remark,String tag){
        Task task=null;
        try {
            task=getTaskService.getTaskById(taskId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(task==null){
            return -2;
        }
        int result=-1;
        task.setTaskName(taskName);
        task.setStartTime(startTime);
        task.setFinishTime(stopTime);
        task.setRemind(remind);
        task.setRemark(remark);
        task.setTag(tag);
        try{
            result=modifyTaskService.modifyTask(task);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
