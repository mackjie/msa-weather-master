package com.weather.spring.cloud.initializrstart.design.mode.factory.abstractf;

/**
 * @program: msa-weather-master
 * @description: This is factory for all product
 * @author: W.HL
 * @create: 2019-04-01 17:46
 **/

public interface Factory
{
    /**
     * create car
     * @return
     */
    CarService[] getCar();

    /**
     * create Tv
     * @return
     */
    TvService[] getTv();
}
