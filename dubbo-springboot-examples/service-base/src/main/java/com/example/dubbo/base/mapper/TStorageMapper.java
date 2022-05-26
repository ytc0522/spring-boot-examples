package com.example.dubbo.base.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dubbo.base.domain.TStorage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @Entity com.example.dubbo.provider..TStorage
 */
@Mapper
public interface TStorageMapper extends BaseMapper<TStorage> {

    @Update("update t_storage set count = count-${count} where commodity_code = #{commodityCode}")
    void decreaseStorage(@Param("count") Integer count, @Param("commodityCode") String commodityCode);

}




