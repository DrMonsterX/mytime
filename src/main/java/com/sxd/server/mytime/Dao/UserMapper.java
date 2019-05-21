package com.sxd.server.mytime.Dao;

import com.sxd.server.mytime.Entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
}
