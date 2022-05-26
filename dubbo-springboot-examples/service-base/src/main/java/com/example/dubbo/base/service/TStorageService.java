package com.example.dubbo.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dubbo.base.domain.TStorage;

/**
 *
 */
public interface TStorageService extends IService<TStorage> {


    /**
     * 扣减库存
     */
    void decreaseStorage(Integer count, String commodityCode);


}
