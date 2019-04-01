package com.weather.spring.cloud.initializrstart.design.mode.factory.simplef;

/**
 * @program: msa-weather-master
 * @description: This is BM car service for create
 * @author: W.HL
 * @create: 2019-04-01 14:13
 **/

public class BMCarServiceImpl implements CarService
{
    /**
     * create car object
     */
    @Override
    public void createCar()
    {
        System.out.println("There is creating BM car");
    }
}
