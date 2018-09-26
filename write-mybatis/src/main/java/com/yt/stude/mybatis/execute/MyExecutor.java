package com.yt.stude.mybatis.execute;

/**
 * @ClassName: MyExecutor
 * @Author: yangting@ty
 * @CreateDate: 2018/9/26 10:57
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/26 10:57
 * @UpdateRemark: 更新说明
 **/
public interface MyExecutor
{
    public <T> T query(String statement,Object parmeter);
}
