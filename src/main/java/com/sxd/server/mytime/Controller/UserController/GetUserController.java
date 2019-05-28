package com.sxd.server.mytime.Controller.UserController;

import com.sxd.server.mytime.Entity.User;
import com.sxd.server.mytime.Service.UserService.GetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserController implements IGetUser {
    @Autowired
    private GetUserService getUserService;


    //通过id查询用户数据，返回用户信息
    //若id不存在则返回null
    @RequestMapping(value = "checkLogin",method = RequestMethod.GET)
    public User getUser(Integer userId){
        User user=null;
        try{
            user= getUserService.getUser(userId);
        }catch (Exception e){
            System.out.println(e);
        }
        return user;
    }
}
