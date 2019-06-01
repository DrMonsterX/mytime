package com.sxd.server.mytime.Controller.ScheduleController;

public interface IAddSchedule {
    //添加日程
    public int addSchedule(Integer userId,Integer position,String scheduleName,String startTime, String stopTime, String remark,Integer remind);
}
