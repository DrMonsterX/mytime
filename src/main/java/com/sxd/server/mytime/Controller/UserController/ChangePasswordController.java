package com.sxd.server.mytime.Controller.UserController;

import com.sxd.server.mytime.Service.UserService.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChangePasswordController {
    @Autowired
    private PasswordService passwordService;

    //通过id，新密码来修改用户密码，返回结果。-1调用失败，0失败，1成功，2用户不存在。
    @RequestMapping(value = "changePassword",method = RequestMethod.GET)
    public int changePassword(Integer userId,String password){
        int result=-1;
        try{
            result=passwordService.changePassword(userId,password);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
