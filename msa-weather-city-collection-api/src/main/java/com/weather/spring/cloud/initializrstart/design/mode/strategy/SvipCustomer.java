package com.weather.spring.cloud.initializrstart.design.mode.strategy;

import java.math.BigDecimal;

/**
 * @program: msa-weather-master
 * @description: This is svip customer service has 5% off account
 * @author: W.HL
 * @create: 2019-03-27 17:07
 **/

public class SvipCustomer implements StrategyService
{

    /**
     * get the prices by customer type 5% off account
     *
     * @param money
     * @return
     */
    @Override
    public double getPrices(double money)
    {
        return new BigDecimal(money).multiply(new BigDecimal(0.50)).doubleValue();
    }
}
