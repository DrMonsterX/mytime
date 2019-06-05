package com.sxd.server.mytime.Service.CompletenessService;

import com.sxd.server.mytime.Dao.CompletenessMapper;
import com.sxd.server.mytime.Entity.Completeness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModifyCompleteService {
    @Autowired
    private CompletenessMapper completenessMapper;

    public int updateCompleteness(Completeness completeness)throws Exception{
        return completenessMapper.updateByPrimaryKey(completeness);
    }
}
