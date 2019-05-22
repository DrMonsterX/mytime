package com.sxd.server.mytime.Service.UserService;

import com.sxd.server.mytime.Dao.UserMapper;
import com.sxd.server.mytime.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UserMapper userMapper;

    //通过userId主键查询user信息
    public User getUser(Integer userId)throws Exception{
        User user=null;
        user=userMapper.selectByPrimaryKey(userId);
        return user;
    }
}
