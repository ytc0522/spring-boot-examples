package com.example.dubbo.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dubbo.base.domain.TOrder;
import com.example.dubbo.base.mapper.TOrderMapper;
import com.example.dubbo.base.service.TOrderService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder>
    implements TOrderService{

}




