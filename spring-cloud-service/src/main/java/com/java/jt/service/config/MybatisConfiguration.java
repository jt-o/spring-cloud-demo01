package com.java.jt.service.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 2019/10/24 14:59
 */
@Configuration
@MapperScan("com.java.jt.service.mapper")
public class MybatisConfiguration {
}
