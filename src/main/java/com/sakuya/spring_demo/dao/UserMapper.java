package com.sakuya.spring_demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sakuya.spring_demo.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author : sakuya
 * @create 2023/3/2 17:04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
