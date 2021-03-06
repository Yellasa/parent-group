package com.yt.stude.consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: StartApplication
 * @Author: yangting@ty
 * @CreateDate: 2018/8/29 11:29
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/29 11:29
 * @UpdateRemark: 更新说明
 **/
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.yt.stude.*.dao")
//添加熔断@EnableCircuitBreaker//或@EnableHystrix  也可以使用@SpringCloudApplication注解
@SpringCloudApplication
@ComponentScan
public class OtherStartConsumerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(OtherStartConsumerApplication.class,args);
        System.out.println("*****************************Other 服务启动成功 *******************");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
