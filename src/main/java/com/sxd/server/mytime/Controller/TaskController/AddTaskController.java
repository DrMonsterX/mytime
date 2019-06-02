package com.sxd.server.mytime.Controller.TaskController;


import com.sxd.server.mytime.Entity.Task;
import com.sxd.server.mytime.Service.TaskService.AddTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddTaskController {
    @Autowired
    private AddTaskService addTaskService;

    @RequestMapping(value = "addTask",method = RequestMethod.GET)
    public int addTask(Integer userId,Integer position,String taskName,String startTime,String stopTime,String remark,Integer remind,String tag){
        Task task=new Task();
        task.setUserId(userId);
        task.setTaskName(taskName);
        task.setTag(tag);
        task.setStartTime(startTime);
        task.setFinishTime(stopTime);
        task.setRemark(remark);
        task.setRemind(remind);
        task.setPosition(position);
        task.setIsComplete(0);
        int result=-1;
        try{
            result=addTaskService.addTask(task);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
