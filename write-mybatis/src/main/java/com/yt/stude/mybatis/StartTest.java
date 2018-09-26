package com.yt.stude.mybatis;

import com.yt.stude.mybatis.mapper.UserMapper;
import com.yt.stude.mybatis.pojo.User;
import com.yt.stude.mybatis.session.MySqlSession;

/**
 * @ClassName: StartTest
 * @Author: yangting@ty
 * @CreateDate: 2018/9/26 11:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/26 11:14
 * @UpdateRemark: 更新说明
 **/
public class StartTest
{
    public static void main(String[] args)
    {
        MySqlSession sqlSession = new MySqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById("9");
        System.out.println("=========== user.name:"+user.getName());

    }
}
