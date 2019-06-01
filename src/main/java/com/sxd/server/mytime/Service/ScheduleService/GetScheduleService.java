package com.sxd.server.mytime.Service.ScheduleService;

import com.sxd.server.mytime.Dao.ScheduleMapper;
import com.sxd.server.mytime.Entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    //根据scheduleId获取对应的schedule实体
    public Schedule getScheduleById(Integer scheduleId)throws Exception{
        Schedule schedule=null;
        schedule=scheduleMapper.selectByPrimaryKey(scheduleId);
        return schedule;
    }
}
