package com.sxd.server.mytime.Service.ScheduleService;

import com.sxd.server.mytime.Dao.ScheduleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    public int deleteSchedule(Integer scheduleId)throws Exception{
        return scheduleMapper.deleteByPrimaryKey(scheduleId);
    }
}
