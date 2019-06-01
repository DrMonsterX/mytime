package com.sxd.server.mytime.Controller.ScheduleController;

import com.sxd.server.mytime.Entity.Schedule;
import com.sxd.server.mytime.Service.ScheduleService.GetScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetScheduleController {
    @Autowired
    private GetScheduleService getScheduleService;

    //根据scheduleId获取该Schedule信息
    @RequestMapping(value = "getScheduleById",method = RequestMethod.GET)
    public Schedule getScheduleById(Integer scheduleId){
        Schedule schedule=null;
        try {
            schedule=getScheduleService.getScheduleById(scheduleId);
        }catch (Exception e){
            System.out.println(e);
        }
        return schedule;
    }

    //获取目标用户的所有日程信息
    @RequestMapping(value = "getScheduleByUser",method = RequestMethod.GET)
    public List<Schedule> getScheduleByUser(Integer userId){
        List<Schedule> list=new ArrayList<>();
        try{
            list=getScheduleService.getScheduleByUser(userId);
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }
}
