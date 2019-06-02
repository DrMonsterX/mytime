package com.sxd.server.mytime.Entity;

import javax.persistence.*;

@Table(name = "node")
public class Node {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    @Column(name = "node_id")
    private Integer nodeId;

    @Column(name = "task_id")
    private Integer taskId;

    @Column(name = "node_name")
    private String nodeName;

    @Column(name = "node_time")
    private String nodeTime;

    @Column(name = "is_complete")
    private Integer isComplete;

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeTime() {
        return nodeTime;
    }

    public void setNodeTime(String nodeTime) {
        this.nodeTime = nodeTime;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }
}
