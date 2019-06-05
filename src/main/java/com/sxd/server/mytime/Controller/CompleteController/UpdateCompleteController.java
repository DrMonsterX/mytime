package com.sxd.server.mytime.Controller.CompleteController;

import com.sxd.server.mytime.Entity.Completeness;
import com.sxd.server.mytime.Service.CompletenessService.GetCompleteService;
import com.sxd.server.mytime.Service.CompletenessService.ModifyCompleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateCompleteController {
    @Autowired
    private GetCompleteService getCompleteService;
    @Autowired
    private ModifyCompleteService modifyCompleteService;

    //更新本周实时完成度
    @RequestMapping(value = "updateComplete",method = RequestMethod.GET)
    public int updateComplete(Integer userId,Integer weekCompleteness){
        Completeness completeness=null;
        try {
            completeness=getCompleteService.getCompleteness(userId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(completeness==null){
            return -2;
        }
        completeness.setWeekCompleteness(weekCompleteness);
        int result=-1;
        try {
            result=modifyCompleteService.updateCompleteness(completeness);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
