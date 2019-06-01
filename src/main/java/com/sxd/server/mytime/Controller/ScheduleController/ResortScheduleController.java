package com.sxd.server.mytime.Controller.ScheduleController;

import com.sxd.server.mytime.Entity.Schedule;
import com.sxd.server.mytime.Service.ScheduleService.GetScheduleService;
import com.sxd.server.mytime.Service.ScheduleService.ModifyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResortScheduleController {
    @Autowired
    private GetScheduleController getScheduleController;
    @Autowired
    private ModifyScheduleService modifyScheduleService;

    //修改日程位置信息
    @RequestMapping(value = "resortSchedule",method = RequestMethod.GET)
    public int resortSchedule(Integer scheduleId,Integer position){
        Schedule schedule=null;
        schedule=getScheduleController.getScheduleById(scheduleId);
        if(schedule==null){
            return -2;
        }
        int result=-1;
        schedule.setPosition(position);
        try{
            result=modifyScheduleService.modifySchedule(schedule);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
