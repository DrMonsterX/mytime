package com.sxd.server.mytime.Service.ScheduleService;

import com.sxd.server.mytime.Dao.ScheduleMapper;
import com.sxd.server.mytime.Entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModifyScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    public int modifySchedule(Schedule schedule)throws Exception{
        return scheduleMapper.updateByPrimaryKey(schedule);
    }
}
