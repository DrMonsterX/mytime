package com.sxd.server.mytime.Service.TaskService;

import com.sxd.server.mytime.Dao.NodeMapper;
import com.sxd.server.mytime.Entity.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class NodeService {
    @Autowired
    private NodeMapper nodeMapper;

    //添加结点
    public int addNode(Node node)throws Exception{
        return nodeMapper.insert(node);
    }

    //删除目标任务的所有结点
    public int deleteAllNode(Integer taskId)throws Exception{
        Example example=new Example(Node.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("taskId",taskId);
        return nodeMapper.deleteByExample(example);
    }

    //修改结点完成信息
    public int finishNode(Integer nodeId,Integer finishNum)throws Exception{
        Node node=null;
        node=nodeMapper.selectByPrimaryKey(nodeId);
        if(node==null){
            return -2;
        }
        node.setIsComplete(finishNum);
        return nodeMapper.updateByPrimaryKey(node);
    }
}
