package com.yt.java8.demo.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @ClassName: Clazz1
 * @Author: yangting@ty
 * @CreateDate: 2018/8/3 15:57
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/3 15:57
 * @UpdateRemark: 更新说明
 **/
public class Clazz1
{

    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
            List<R> resut = new ArrayList<>();
            list.forEach(e->resut.add(f.apply(e)));
            return resut;
    }

    public static void main(String[] args)
    {
        List<Integer> map = map(Arrays.asList("lamdas", "in", "action"), (String s) -> s.length());
        map.forEach(System.out::println);
    }
}
