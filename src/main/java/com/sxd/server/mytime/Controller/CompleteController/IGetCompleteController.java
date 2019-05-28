package com.sxd.server.mytime.Controller.CompleteController;

public interface IGetCompleteController {
    //根据用户id获取用户本周完成度数据
    public int getWeekComplete(Integer userId);
}
