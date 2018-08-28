package com.yt.java8.demo.domain;

/**
 * <br/>
 * Created: 2018/8/17 10:58 <br/>
 *
 * @author yangting
 * @version 1.0
 * @Modified by:
 * @since JDK 1.8
 */
public interface TriFunction<T,U,V,R>
{
    R create(T t,U u,V v);
}

