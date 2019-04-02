package com.weather.spring.cloud.initializrstart.design.mode.factory.abstractf;

/**
 * @program: msa-weather-master
 * @description: This is car factory
 * @author: W.HL
 * @create: 2019-04-01 17:52
 **/

public class UsaFactory implements Factory
{
    /**
     * create car
     *
     * @return
     */
    @Override
    public CarService[] getCar()
    {
        return new CarService[]{new AdiCarImpl()};
    }

    /**
     * create Tv
     *
     * @return
     */
    @Override
    public TvService[] getTv()
    {
        return new TvService[]{new GeLiTvImpl()};
    }

    public UsaFactory()
    {
        System.out.println("***************USA*****************");
    }
}
