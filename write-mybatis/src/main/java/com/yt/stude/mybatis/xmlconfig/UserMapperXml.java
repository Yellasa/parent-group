package com.yt.stude.mybatis.xmlconfig;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: UserMapperXml
 * @Author: yangting@ty
 * @CreateDate: 2018/9/26 10:53
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/26 10:53
 * @UpdateRemark: 更新说明
 * xml配置类
 **/
public class UserMapperXml
{
    public static final String namespace="com.yt.stude.mybatis.mapper.UserMapper";

    public static final Map<String,String> map = new HashMap<>();

    static {
        map.put("getUserById","select * from fp_bank_info where id=?");
    }
}
