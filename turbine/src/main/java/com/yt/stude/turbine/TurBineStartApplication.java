package com.yt.stude.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @ClassName: TurBineStartApplication
 * @Author: yangting@ty
 * @CreateDate: 2018/9/3 9:46
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/3 9:46
 * @UpdateRemark: 更新说明
 **/
@SpringBootApplication
@EnableTurbine
public class TurBineStartApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(TurBineStartApplication.class,args);
        System.out.println("=================  TurBine启动成功  ===================");
    }
}
