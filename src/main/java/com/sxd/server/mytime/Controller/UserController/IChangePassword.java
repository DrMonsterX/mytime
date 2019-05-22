package com.sxd.server.mytime.Controller.UserController;

public interface IChangePassword {
    //通过用户id和新密码修改密码
    public int changePassword(Integer userId,String password);
}
