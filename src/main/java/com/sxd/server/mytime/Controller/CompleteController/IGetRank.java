package com.sxd.server.mytime.Controller.CompleteController;

import com.sxd.server.mytime.Entity.User;

import java.util.List;

public interface IGetRank {
    //通过当前用户id获取该用户实时好友排名
    public List<User> getRank(Integer userId);
}
