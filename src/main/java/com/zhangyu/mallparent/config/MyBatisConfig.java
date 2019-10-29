package com.zhangyu.mallparent.config;

/**
 * @author zhangyu
 * @description
 * @date 2019/9/25
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan(basePackages = {"com.zhangyu.mallparent.mbg.mapper", "com.zhangyu.mallparent.dao"})
public class MyBatisConfig {
}
