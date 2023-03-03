package com.sakuya.spring_demo;

import com.sakuya.spring_demo.dao.UserMapper;
import com.sakuya.spring_demo.domain.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@MapperScan("com.sakuya.spring_demo.dao")
public class SpringDemoApplication {


    @Autowired
    private UserMapper userMapper;

    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        // Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
