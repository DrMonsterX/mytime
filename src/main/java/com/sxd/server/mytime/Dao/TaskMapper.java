package com.sxd.server.mytime.Dao;

import com.sxd.server.mytime.Entity.Task;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface TaskMapper extends Mapper<Task> {
}
