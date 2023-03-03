package com.sakuya.spring_demo.domain.entity;

import lombok.Data;

/**
 * @Author : sakuya
 * @create 2023/3/2 17:02
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
