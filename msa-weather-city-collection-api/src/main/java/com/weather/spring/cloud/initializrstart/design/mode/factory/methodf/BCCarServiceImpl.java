package com.weather.spring.cloud.initializrstart.design.mode.factory.methodf;

/**
 * @program: msa-weather-master
 * @description: This is a product for creating BM car
 * @author: W.HL
 * @create: 2019-04-01 15:30
 **/

public class BCCarServiceImpl implements Product
{
    /**
     * create car service
     */
    @Override
    public void createCar()
    {
        System.out.println("There is creating BC car");
    }

    public BCCarServiceImpl()
    {
        System.out.println("There is creating BC car");
    }
}
