package com.example.dubbo.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dubbo.base.domain.UndoLog;
import com.example.dubbo.base.mapper.UndoLogMapper;
import com.example.dubbo.base.service.UndoLogService;
import org.apache.dubbo.config.annotation.Service;

/**
 *
 */
@Service(version = "1.0")
public class UndoLogServiceImpl extends ServiceImpl<UndoLogMapper, UndoLog>
    implements UndoLogService{

}




