package com.sxd.server.mytime.Controller.UserController;

import com.sxd.server.mytime.Entity.User;

import java.util.List;

public interface IFollow {

    //获取当前用户所关注的用户的信息
    public List<User> getFollow(Integer userId);

    //设置当前用户关注目标用户
    public int followUser(Integer myId,Integer targetId);

    //设置当前用户取消关注目标用户
    public int deleteFollow(Integer myId,Integer targetId);
}
