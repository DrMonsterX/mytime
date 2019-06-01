package com.sxd.server.mytime.Controller.ScheduleController;


import com.sxd.server.mytime.Service.ScheduleService.DeleteScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteScheduleController {
    @Autowired
    private DeleteScheduleService deleteScheduleService;

    //根据scheduleId删除对应日程，返回结果状态码。
    @RequestMapping(value = "deleteSchedule",method = RequestMethod.GET)
    public int deleteSchedule(Integer scheduleId){
        int result=-1;
        try {
            result=deleteScheduleService.deleteSchedule(scheduleId);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
