package com.yt.stude.mybatis.session;

import com.yt.stude.mybatis.execute.MyExecutor;
import com.yt.stude.mybatis.execute.impl.MyExecutorImpl;
import com.yt.stude.mybatis.handler.MyMapperHandler;

import java.lang.reflect.Proxy;

/**
 * @ClassName: MySqlSession
 * @Author: yangting@ty
 * @CreateDate: 2018/9/26 10:56
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/26 10:56
 * @UpdateRemark: 更新说明
 **/
public class MySqlSession
{
    private MyExecutor executor = new MyExecutorImpl();


    public <T> T seelectOne(String statement,Object parament){
        return executor.query(statement,parament);
    }

    public <T> T getMapper(Class<T> clas){
        return (T) Proxy.newProxyInstance(clas.getClassLoader(),new Class[]{clas},new MyMapperHandler<>(this));
    }
}
