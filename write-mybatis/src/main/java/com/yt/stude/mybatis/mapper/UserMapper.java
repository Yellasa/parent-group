package com.yt.stude.mybatis.mapper;

import com.yt.stude.mybatis.pojo.User;

/**
 * <br/>
 * Created: 2018/9/26 10:53 <br/>
 *
 * @author yangting
 * @version 1.0
 * @Modified by:
 * @since JDK 1.8
 */
public interface UserMapper
{
    User getUserById(String id);
}

