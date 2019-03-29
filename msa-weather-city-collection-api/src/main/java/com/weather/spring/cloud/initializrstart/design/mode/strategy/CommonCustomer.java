package com.weather.spring.cloud.initializrstart.design.mode.strategy;

/**
 * @program: msa-weather-master
 * @description: This is common customer server and have no account
 * @author: W.HL
 * @create: 2019-03-27 16:43
 **/

public class CommonCustomer implements StrategyService
{

    /**
     * get zhe prices by customer type
     *
     * @param money
     * @return
     */
    @Override
    public double getPrices(double money)
    {
        return money;
    }
}
