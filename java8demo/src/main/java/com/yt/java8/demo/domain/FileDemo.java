package com.yt.java8.demo.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: FileDemo
 * @Author: yangting@ty
 * @CreateDate: 2018/8/3 15:31
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/3 15:31
 * @UpdateRemark: 更新说明
 **/
public class FileDemo
{

    public static String process(BufferReaderProcess process) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\ayangting\\velocity.log"))){              return  process.process(br);
        }
    }

    public static void main(String[] args) throws IOException
    {
        String process = process((BufferedReader br) -> br.readLine());
        System.out.println(process);
        String process1 = process((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println(process1);
    }

}
