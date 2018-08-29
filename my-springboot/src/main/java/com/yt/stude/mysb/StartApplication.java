package com.yt.stude.mysb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: StartApplication
 * @Author: yangting@ty
 * @CreateDate: 2018/8/29 11:25
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/29 11:25
 * @UpdateRemark: 更新说明
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yt.stude.*.dao")
public class StartApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(StartApplication.class,args);
        System.out.println("==========================  服务启动成功 ===================");
    }
}
