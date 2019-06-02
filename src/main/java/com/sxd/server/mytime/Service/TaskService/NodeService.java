package com.sxd.server.mytime.Service.TaskService;

import com.sxd.server.mytime.Dao.NodeMapper;
import com.sxd.server.mytime.Entity.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NodeService {
    @Autowired
    private NodeMapper nodeMapper;

    //添加结点
    public int addNode(Node node)throws Exception{
        return nodeMapper.insert(node);
    }


}
