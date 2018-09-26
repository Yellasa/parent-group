package com.yt.stude.mybatis.handler;

import com.yt.stude.mybatis.session.MySqlSession;
import com.yt.stude.mybatis.xmlconfig.UserMapperXml;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: MyMapperHandler
 * @Author: yangting@ty
 * @CreateDate: 2018/9/26 11:10
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/26 11:10
 * @UpdateRemark: 更新说明
 **/
public class MyMapperHandler<T> implements InvocationHandler
{
    private MySqlSession mySqlSession = null;

    public MyMapperHandler(MySqlSession mySqlSession)
    {
        this.mySqlSession = mySqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        Class<?> declaringClass = method.getDeclaringClass();
        if (declaringClass.getName().equals(UserMapperXml.namespace)){
            String sql = UserMapperXml.map.get(method.getName());
            return mySqlSession.seelectOne(sql,String.valueOf(args[0]));
        }
        return null;
    }
}
