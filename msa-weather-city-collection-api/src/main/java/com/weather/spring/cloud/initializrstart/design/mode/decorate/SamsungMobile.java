package com.weather.spring.cloud.initializrstart.design.mode.decorate;

/**
 * @program: msa-weather-master
 * @description: This is Samung mobile demo
 * @author: W.HL
 * @create: 2019-03-29 14:48
 **/

public class SamsungMobile extends Mobile
{
    /**
     * desc something
     */
    @Override
    public String getDesc()
    {
        return "This is Samsung S10 mobile";
    }
}
