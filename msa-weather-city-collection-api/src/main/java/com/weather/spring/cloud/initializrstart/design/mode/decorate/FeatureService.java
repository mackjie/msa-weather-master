package com.weather.spring.cloud.initializrstart.design.mode.decorate;

/**
 * @program: msa-weather-master
 * @description: This is all mobile features parent object
 * @author: W.HL
 * @create: 2019-03-29 14:51
 **/

public abstract class FeatureService extends Mobile
{
    /**
     * desc something
     */
    @Override
    public abstract String getDesc();
}
