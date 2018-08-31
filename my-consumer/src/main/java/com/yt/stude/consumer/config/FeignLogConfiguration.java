package com.yt.stude.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: FeignLogConfiguration
 * @Author: yangting@ty
 * @CreateDate: 2018/8/31 11:27
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/31 11:27
 * @UpdateRemark: 更新说明
 * 配置feign日志
 **/
@Configuration
public class FeignLogConfiguration
{

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.BASIC;
        //return Logger.Level.FULL;
    }
}
