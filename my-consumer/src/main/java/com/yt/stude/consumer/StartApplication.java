package com.yt.stude.consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @ClassName: StartApplication
 * @Author: yangting@ty
 * @CreateDate: 2018/8/29 11:29
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/29 11:29
 * @UpdateRemark: 更新说明
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.yt.stude.*.dao")
public class StartApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(StartApplication.class,args);
        System.out.println("***************************** 服务启动成功 *******************");
    }
}
