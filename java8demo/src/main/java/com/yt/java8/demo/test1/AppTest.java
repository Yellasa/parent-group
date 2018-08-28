package com.yt.java8.demo.test1;

import com.yt.java8.demo.domain.Apple;
import com.yt.java8.demo.domain.TriFunction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName: AppTest
 * @Author: yangting@ty
 * @CreateDate: 2018/8/20 13:58
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/20 13:58
 * @UpdateRemark: 更新说明
 **/
public class AppTest
{

    public static void main(String[] args)
    {
        //BiFunction<Integer,String,Apple> appleFactory = Apple::new;
        TriFunction<Integer,String,String,Apple> appleFactory = Apple::new;
        List<Apple> apples = new ArrayList<>(3);
        apples.add(appleFactory.create(100,"CN","green"));
        apples.add(appleFactory.create(80,"US","yellow"));
        apples.add(appleFactory.create(100,"US","red"));

        apples.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getCountry));

        apples.forEach(System.out::println);

    }
}
