package com.yt.java8.demo.domain;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * <br/>
 * Created: 2018/8/3 15:26 <br/>
 *
 * @author yangting
 * @version 1.0
 * @Modified by:
 * @since JDK 1.8
 */
@FunctionalInterface
public interface BufferReaderProcess
{
    String process(BufferedReader br) throws IOException;
}

