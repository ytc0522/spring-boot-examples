package com.example.dubbo.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dubbo.base.domain.TOrder;

/**
 *
 */
public interface TOrderService extends IService<TOrder> {

    public void createOrder(Integer count,String commodityCode);


    void mockAndSaveOrder(Integer count,String commodityCode);


}
