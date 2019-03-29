package com.weather.spring.cloud.initializrstart.design.mode.strategy;

import java.math.BigDecimal;

/**
 * @program: msa-weather-master
 * @description: Thi is new customer server has 9% off account
 * @author: W.HL
 * @create: 2019-03-27 17:10
 **/

public class NewCustomer implements StrategyService
{

    /**
     * get 9% off account prices by customer type
     *
     * @param money
     * @return
     */
    @Override
    public double getPrices(double money)
    {
        return new BigDecimal(money).multiply(new BigDecimal(0.90)).doubleValue();
    }
}
