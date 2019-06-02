package com.sxd.server.mytime.Controller.TaskController;

import com.sxd.server.mytime.Entity.Node;
import com.sxd.server.mytime.Service.TaskService.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {
    @Autowired
    private NodeService nodeService;

    //添加结点
    @RequestMapping(value = "addNode",method = RequestMethod.GET)
    public int addNode(Integer taskId,String nodeName,String nodeTime,Integer finishNum){
        Node node=new Node();
        node.setTaskId(taskId);
        node.setNodeName(nodeName);
        node.setNodeTime(nodeTime);
        node.setIsComplete(finishNum);
        int result=-1;
        try{
            result=nodeService.addNode(node);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    //删除对应任务所有结点
    @RequestMapping(value = "deleteAllNode",method = RequestMethod.GET)
    public int deleteAllNode(Integer taskId){
        int result=-1;
        try {
            result=nodeService.deleteAllNode(taskId);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    //修改结点完成信息
    @RequestMapping(value = "finishNode",method = RequestMethod.GET)
    public int finishNode(Integer nodeId,Integer finishNum){
        int result=-1;
        try {
            result=nodeService.finishNode(nodeId,finishNum);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
