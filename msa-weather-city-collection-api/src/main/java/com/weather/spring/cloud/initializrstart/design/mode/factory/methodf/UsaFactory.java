package com.weather.spring.cloud.initializrstart.design.mode.factory.methodf;

/**
 * @program: msa-weather-master
 * @description: This is a factory for creating car in chinese
 * @author: W.HL
 * @create: 2019-04-01 15:28
 **/

public class UsaFactory implements Factory
{

    public UsaFactory()
    {
        System.out.println("*********************USA Factory********************");
    }

    @Override
    public Product[] getProduct()
    {
        return new Product[]{new BMCarServiceImpl(),new BCCarServiceImpl()};
    }
}
