package com.sxd.server.mytime.Dao;

import com.sxd.server.mytime.Entity.Schedule;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ScheduleMapper extends Mapper<Schedule> {
}
