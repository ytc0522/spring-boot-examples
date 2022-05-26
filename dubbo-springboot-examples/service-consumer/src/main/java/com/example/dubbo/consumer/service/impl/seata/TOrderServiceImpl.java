package com.example.dubbo.consumer.service.impl.seata;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dubbo.base.domain.TOrder;
import com.example.dubbo.base.mapper.TOrderMapper;
import com.example.dubbo.base.service.TOrderService;
import com.example.dubbo.base.service.TStorageService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 *
 */
@Slf4j
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder>
        implements TOrderService {

    @Reference(version = "1.0")
    private TStorageService storageService;

    @GlobalTransactional
    @Transactional
    public void createOrder(Integer count, String commodityCode) {

        log.info("开始全局事务。XID:{}", RootContext.getXID());
        // 扣减库存
        storageService.decreaseStorage(count, commodityCode);

        // 保存订单
        mockAndSaveOrder(count, commodityCode);

        // 模仿异常发生
        int i = 4/0;


    }

    @Override
    public void mockAndSaveOrder(Integer count, String commodityCode) {
        TOrder tOrder = new TOrder();
        tOrder.setOrderNo(UUID.randomUUID().toString());
        tOrder.setCount(count);
        tOrder.setCommodityCode(commodityCode);
        tOrder.setUserId("001");
        tOrder.setAmount(100D);
        this.save(tOrder);
        log.info("保存订单成功");
    }


}




