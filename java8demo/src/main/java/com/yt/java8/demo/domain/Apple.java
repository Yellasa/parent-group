package com.yt.java8.demo.domain;

/**
 * @ClassName: Apple
 * @Author: yangting@ty
 * @CreateDate: 2018/8/20 13:56
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/20 13:56
 * @UpdateRemark: 更新说明
 **/
public class Apple
{
    private Integer weight;

    private String country;

    private String color;


    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public void setWeight(Integer weight)
    {
        this.weight = weight;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Apple(Integer weight, String country, String color)
    {
        this.weight = weight;
        this.country = country;
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "Apple{" +
                "weight=" + weight +
                ", country='" + country + '\'' +
                '}';
    }
}
