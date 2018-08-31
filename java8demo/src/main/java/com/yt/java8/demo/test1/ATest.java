package com.yt.java8.demo.test1;

import com.yt.java8.demo.domain.TriFunction;

import java.awt.*;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

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


        Map<String , BigDecimal> momentMap = new LinkedHashMap<>(10);
        momentMap.put("23:00",new BigDecimal(50));
        momentMap.put("23:15",new BigDecimal(100));
        momentMap.put("23:30",new BigDecimal(150));
        momentMap.put("23:45",new BigDecimal(200));

        BigDecimal max = momentMap.values().stream().max((u1, u2) -> u1.compareTo(u2)).get();
        BigDecimal min = momentMap.values().stream().min((u1, u2) -> u1.compareTo(u2)).get();
        System.out.println(max);
        System.out.println(min);
    }
}
