package com.sxd.server.mytime.Controller.ScheduleController;

import com.sxd.server.mytime.Entity.Schedule;
import com.sxd.server.mytime.Service.ScheduleService.AddScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddScheduleController {
    @Autowired
    private AddScheduleService addScheduleService;

    //添加日程
    @RequestMapping(value = "addSchedule",method = RequestMethod.GET)
    public int addSchedule(Integer userId,Integer position,String scheduleName, String startTime, String stopTime, String remark,Integer remind){
        Schedule schedule=new Schedule();
        schedule.setUserId(userId);
        schedule.setPosition(position);
        schedule.setScheduleName(scheduleName);
        schedule.setStartTime(startTime);
        schedule.setFinishTime(stopTime);
        schedule.setRemark(remark);
        schedule.setIsRemind(remind);
        int result=-1;
        try {
            result=addScheduleService.addSchedule(schedule);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
