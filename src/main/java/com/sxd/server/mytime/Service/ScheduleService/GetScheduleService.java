package com.sxd.server.mytime.Service.ScheduleService;

import com.sxd.server.mytime.Dao.ScheduleMapper;
import com.sxd.server.mytime.Entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

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

    //获取目标用户的所有日程
    public List<Schedule> getScheduleByUser(Integer userId)throws Exception{
        List<Schedule> list=null;
        Example example=new Example(Schedule.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("userId",userId);
        list=scheduleMapper.selectByExample(example);
        return list;
    }
}
