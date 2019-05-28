package com.sxd.server.mytime.Controller.CompleteController;

import java.util.List;

public interface IGetHistory {
    //通过当前用户id获取该用户的历史5周完成度数组
    public List<Integer> getHistory(Integer userId);
}
