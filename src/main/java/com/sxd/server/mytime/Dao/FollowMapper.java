package com.sxd.server.mytime.Dao;

import com.sxd.server.mytime.Entity.Follow;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface FollowMapper extends Mapper<Follow> {
}
