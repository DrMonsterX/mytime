package com.sxd.server.mytime.Controller.UserController;

import com.sxd.server.mytime.Entity.User;
import com.sxd.server.mytime.Service.UserService.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistController {
    @Autowired
    private RegistService registService;

    @RequestMapping(value = "regist",method = RequestMethod.GET)
    public int regist(String name,Integer iconId,String password){
        User user=new User();
        user.setName(name);
        user.setIconId(iconId);
        user.setPassword(password);
        int userId=0;
        try {
            userId=registService.regist(user);
        }catch (Exception e){
            System.out.println(e);
        }
        return userId;
    }
}
