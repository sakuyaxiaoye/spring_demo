package com.sakuya.spring_demo.service;

import com.sakuya.spring_demo.dao.UserMapper;
import com.sakuya.spring_demo.domain.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : sakuya
 * @create 2023/3/3 11:03
 */
@Service
public interface UserService {

    List<User> getUser();
}
