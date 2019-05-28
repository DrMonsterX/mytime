package com.sxd.server.mytime.Service.UserService;

import com.sxd.server.mytime.Dao.FollowMapper;
import com.sxd.server.mytime.Entity.Follow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class FollowService {
    @Autowired
    private FollowMapper followMapper;

    //通过id获取关注列表
    public List<Follow> getFollow(Integer userId)throws Exception{
        List<Follow> follow=null;
        Example example=new Example(Follow.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("followingId",userId);
        follow=followMapper.selectByExample(example);
        return follow;
    }

    //使当前用户关注目标用户
    public int followUser(Follow follow) throws Exception{
        return followMapper.insert(follow);
    }

    //使当前用户取消关注目标用户
    public int deleteFollow(Integer myId,Integer targetId)throws Exception{
        Example example=new Example(Follow.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("followingId",myId);
        criteria.andEqualTo("followedId",targetId);
        return followMapper.deleteByExample(example);
    }
}
