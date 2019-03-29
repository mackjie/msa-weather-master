package com.weather.spring.cloud.initializrstart.design.mode.strategy;

/**
 * @program: msa-weather-master
 * @description: This is strategy mode acount for customer by different prices
 * @author: W.HL
 * @create: 2019-03-27 16:27
 **/

public interface StrategyService
{
    /**
     * get ?% off account prices by customer type
     * @return
     */
    double getPrices(double money);
}
