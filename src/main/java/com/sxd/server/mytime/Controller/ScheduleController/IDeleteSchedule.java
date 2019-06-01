package com.sxd.server.mytime.Controller.ScheduleController;

public interface IDeleteSchedule {
    //根据scheduleId删除对应日程，返回结果状态码。
    public int deleteSchedule(Integer scheduleId);
}
