package com.yt.sutde.geteway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GateWayZuulStartApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GateWayZuulStartApplication.class,args);

        System.out.println("=================== 网关启动成功ZUUL  ==================");
    }
}
