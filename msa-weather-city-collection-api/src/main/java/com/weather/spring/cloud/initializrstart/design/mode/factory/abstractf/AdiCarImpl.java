package com.weather.spring.cloud.initializrstart.design.mode.factory.abstractf;

/**
 * @program: msa-weather-master
 * @description: This is BMW car creating factory
 * @author: W.HL
 * @create: 2019-04-01 17:49
 **/

public class AdiCarImpl implements CarService
{
    public AdiCarImpl()
    {
        System.out.println("There is creating AD car");
    }
}
