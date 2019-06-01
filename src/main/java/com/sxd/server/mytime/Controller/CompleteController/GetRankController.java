package com.sxd.server.mytime.Controller.CompleteController;

import com.sxd.server.mytime.Controller.UserController.FollowController;
import com.sxd.server.mytime.Controller.UserController.GetUserController;
import com.sxd.server.mytime.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
@RestController
public class GetRankController {
    @Autowired
    private GetCompleteController getCompleteController;
    @Autowired
    private FollowController followController;
    @Autowired
    private GetUserController getUserController;

    //通过当前用户id获取该用户实时好友排名
    @RequestMapping(value = "getRank",method = RequestMethod.GET)
    public List<User> getRank(Integer userId){
        List<User> list;
        list=followController.getFollow(userId);
        if(list.size()==0){
            return list;
        }
        Comparator comparator=new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(getCompleteController.getWeekComplete(o1.getUserId())>getCompleteController.getWeekComplete(o2.getUserId())){
                    return -1;
                }
                else
                    return 1;
            }
        };
        list.add(getUserController.getUser(userId));
        list.sort(comparator);
        return list;
    }
}
