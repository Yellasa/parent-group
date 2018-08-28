package com.yt.stude.startup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: StartApplication
 * @Author: yangting@ty
 * @CreateDate: 2018/8/28 10:03
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/28 10:03
 * @UpdateRemark: 更新说明
 **/
@ServletComponentScan
@SpringBootApplication
@ComponentScan({"com.yt.stude.mysb"})
@MapperScan("com.yt.stude.*.dao")
public class StartApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(StartApplication.class,args);
    }
}
