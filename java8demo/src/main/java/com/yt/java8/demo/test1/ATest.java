package com.yt.java8.demo.test1;

import com.yt.java8.demo.domain.TriFunction;

import java.awt.*;

/**
 * @ClassName: ATest
 * @Author: yangting@ty
 * @CreateDate: 2018/8/17 11:00
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/17 11:00
 * @UpdateRemark: 更新说明
 **/
public class ATest
{
    public static void main(String[] args)
    {
        TriFunction<Integer,Integer,Integer,Color> colorFactory = Color::new;
        Color color = colorFactory.create(1, 2, 3);
    }
}
