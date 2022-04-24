package com.examples.shardingjdbc.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.examples.shardingjdbc.springboot.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {



}
