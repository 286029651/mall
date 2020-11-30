package com.ralph.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ralph.Chen
 * @date 2020/11/26
 */
@Configuration
@MapperScan({"com.ralph.mall.mapper","com.ralph.mall.dao"})
public class MyBatisConfig {
}
