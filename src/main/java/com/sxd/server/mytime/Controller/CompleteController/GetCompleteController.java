package com.sxd.server.mytime.Controller.CompleteController;

import com.sxd.server.mytime.Entity.Completeness;
import com.sxd.server.mytime.Service.CompletenessService.GetCompleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCompleteController {
    @Autowired
    private GetCompleteService getCompleteService;

    //根据用户id获取用户本周完成度数据
    @RequestMapping(value = "getComplete",method = RequestMethod.GET)
    public int getWeekComplete(Integer userId){
        Completeness completeness=null;
        try{
            completeness=getCompleteService.getCompleteness(userId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(completeness==null){
            return 0;
        }else{
            return completeness.getWeekCompleteness();
        }
    }
}
