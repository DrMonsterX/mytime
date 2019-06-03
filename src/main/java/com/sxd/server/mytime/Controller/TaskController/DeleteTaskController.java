package com.sxd.server.mytime.Controller.TaskController;

import com.sxd.server.mytime.Service.TaskService.DeleteTaskService;
import com.sxd.server.mytime.Service.TaskService.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeleteTaskController {
    @Autowired
    private DeleteTaskService deleteTaskService;
    @Autowired
    private NodeService nodeService;

    //根据taskid删除该task以及其所属的所有node
    @RequestMapping(value = "deleteTask",method = RequestMethod.GET)
    public int deleteTask(Integer taskId){
        int result=-1;
        try{
            result=nodeService.deleteAllNode(taskId);
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            result+=deleteTaskService.deleteTask(taskId);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
