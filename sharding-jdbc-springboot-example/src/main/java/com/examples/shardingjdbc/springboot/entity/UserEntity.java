package com.examples.shardingjdbc.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user0")
public class UserEntity {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;




}
