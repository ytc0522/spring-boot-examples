package com.example.dubbo.provider.service.impl.seata;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dubbo.base.domain.TStorage;
import com.example.dubbo.base.mapper.TStorageMapper;
import com.example.dubbo.base.service.TStorageService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 *
 */
@Slf4j
@Service(version = "1.0")
public class TStorageServiceImpl extends ServiceImpl<TStorageMapper, TStorage>
        implements TStorageService {

    @Override
    public void decreaseStorage(Integer count, String commodityCode) {
        log.info("XID:{}", RootContext.getXID());
        this.getBaseMapper().decreaseStorage(count, commodityCode);
        // 模仿异常发生
        //throw new RuntimeException();
        //log.info("商品:{},扣减库存成功:{}", count, commodityCode);
    }
}




