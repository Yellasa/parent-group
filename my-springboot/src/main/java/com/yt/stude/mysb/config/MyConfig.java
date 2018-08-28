package com.yt.stude.mysb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyConfig
 * @Author: yangting@ty
 * @CreateDate: 2018/8/28 10:05
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/28 10:05
 * @UpdateRemark: 更新说明
 **/
@Component
@ConfigurationProperties(prefix="defineTest")
@PropertySource("classpath:define.properties")
public class MyConfig
{

    private String pname;

    private String password;

    public String getPname()
    {
        return pname;
    }

    public void setPname(String pname)
    {
        this.pname = pname;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
