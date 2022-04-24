package com.examples.shardingjdbc.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examples.shardingjdbc.springboot.dao.UserMapper;
import com.examples.shardingjdbc.springboot.entity.UserEntity;
import com.examples.shardingjdbc.springboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {


}
