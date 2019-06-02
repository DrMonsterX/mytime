package com.sxd.server.mytime.Dao;

import com.sxd.server.mytime.Entity.Node;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface NodeMapper extends Mapper<Node> {
}
