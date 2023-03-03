package com.sakuya.spring_demo;

import com.sakuya.spring_demo.dao.UserMapper;
import lombok.Setter;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootTest(classes = SpringDemoApplicationTests.class)
@MapperScan("com.sakuya.spring_demo.dao")
@ComponentScan(basePackages = {"com.sakuya.spring_demo"})
class SpringDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelect(){  
        System.out.println(("----- selectAll method test ------"));
        userMapper.selectList(null).forEach(System.out::println);
    }

}
