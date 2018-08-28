package com.yt.java8.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

/**
 * @ClassName: FiltrerDemo
 * @Author: yangting@ty
 * @CreateDate: 2018/7/30 16:13
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/30 16:13
 * @UpdateRemark: 更新说明
 **/
public class FilterDemo
{

    private ExecutorService pool = Executors.newFixedThreadPool(3);

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(3);
        list.add(new Random().nextInt(100));
        list.add(new Random().nextInt(100));
        list.add(new Random().nextInt(100));
        FilterDemo filtrerDemo = new FilterDemo();
        filtrerDemo.run(list, d->new FilterDemo().test(d).forEach(System.out::println));
    }

    public List<Integer> test(List<Integer> list){

       return list.stream().filter(e-> e>40).collect(toList());
    }

    private <T> void run(T target, Consumer<T> call) {
        try {
            pool.execute(() -> call.accept(target));
            pool.shutdown();
        } catch (Exception e) {
            // pass
            System.out.println("master-station callback error {}"+ e.getMessage());
            e.printStackTrace();
        }
    }


}
