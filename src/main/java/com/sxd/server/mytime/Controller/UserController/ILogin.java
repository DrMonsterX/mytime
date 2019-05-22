package com.sxd.server.mytime.Controller.UserController;

import com.sxd.server.mytime.Entity.User;

//通过id查询用户数据，返回用户信息
public interface ILogin {
    public User checkLogin(Integer userId);
}
