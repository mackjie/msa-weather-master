package com.weather.spring.cloud.initializrstart.design.mode.decorate;

/**
 * @program: msa-weather-master
 * @description: This is apple mobile demo
 * @author: W.HL
 * @create: 2019-03-29 14:50
 **/

public class AppleMobile extends Mobile
{

    /**
     * desc something
     */
    @Override
    public String getDesc()
    {
        return "This is Iphone XR mobile";
    }
}
