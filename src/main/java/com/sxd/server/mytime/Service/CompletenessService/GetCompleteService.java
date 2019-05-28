package com.sxd.server.mytime.Service.CompletenessService;

import com.sxd.server.mytime.Dao.CompletenessMapper;
import com.sxd.server.mytime.Dao.UserMapper;
import com.sxd.server.mytime.Entity.Completeness;
import com.sxd.server.mytime.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetCompleteService {
    @Autowired
    private CompletenessMapper completenessMapper;
    @Autowired
    private UserMapper userMapper;

    //根据用户id获取完成度id号，进而获取完成度数据
    public Completeness getCompleteness(Integer userId)throws Exception{
        User user=null;
        user=userMapper.selectByPrimaryKey(userId);
        if(user==null){
            return null;
        }
        int completenessId=user.getCompletenessId();
        Completeness completeness=null;
        completeness=completenessMapper.selectByPrimaryKey(completenessId);
        return completeness;
    }
}
