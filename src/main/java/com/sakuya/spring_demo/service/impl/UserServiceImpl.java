package com.sakuya.spring_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sakuya.spring_demo.dao.UserMapper;
import com.sakuya.spring_demo.domain.entity.User;
import com.sakuya.spring_demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : sakuya
 * @create 2023/3/3 11:26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        return userMapper.selectList(null);
    }
}
