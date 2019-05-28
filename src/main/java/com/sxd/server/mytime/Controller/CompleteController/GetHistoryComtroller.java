package com.sxd.server.mytime.Controller.CompleteController;

import com.sxd.server.mytime.Entity.Completeness;
import com.sxd.server.mytime.Service.CompletenessService.GetCompleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class GetHistoryComtroller implements IGetHistory{
    @Autowired
    private GetCompleteService getCompleteService;

    //通过当前用户id获取该用户的历史5周完成度数组
    @RequestMapping(value = "getHistory",method = RequestMethod.GET)
    public List<Integer> getHistory(Integer userId){
        List<Integer> list=new ArrayList<>();
        Completeness completeness=null;
        try{
            completeness=getCompleteService.getCompleteness(userId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(completeness==null){
            return list;
        }
        list.add(completeness.getHistoryOne());
        list.add(completeness.getHistoryTwo());
        list.add(completeness.getHistoryThree());
        list.add(completeness.getHistoryFour());
        list.add(completeness.getHistoryFive());
        return list;
    }
}
