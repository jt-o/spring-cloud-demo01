package com.java.jt.service2.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 2019/10/24 14:59
 */
@Configuration
@MapperScan("com.java.jt.service2.mapper")
public class MybatisConfiguration {
}
