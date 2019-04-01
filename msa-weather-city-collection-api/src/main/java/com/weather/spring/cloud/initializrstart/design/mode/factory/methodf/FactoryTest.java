package com.weather.spring.cloud.initializrstart.design.mode.factory.methodf;

/**
 * @program: msa-weather-master
 * @description: This is test for Factory method mode
 * @author: W.HL
 * @create: 2019-04-01 15:38
 **/

public class FactoryTest
{
    public static void main(String[] args)
    {
        Factory chineseFactory = new ChineseFactory();
        chineseFactory.getProduct();

        Factory userFactory = new UsaFactory();
        userFactory.getProduct();
    }
}
