package com.sxd.server.mytime.Service.UserService;

import com.sxd.server.mytime.Dao.CompletenessMapper;
import com.sxd.server.mytime.Dao.UserMapper;
import com.sxd.server.mytime.Entity.Completeness;
import com.sxd.server.mytime.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CompletenessMapper completenessMapper;

    public int regist(User user) throws Exception{
        Completeness completeness=new Completeness();
        completenessMapper.insert(completeness);
        Integer completenessId=completeness.getCompletenessId();
        user.setCompletenessId(completenessId);
        userMapper.insert(user);
        return user.getUserId();
    }
}
