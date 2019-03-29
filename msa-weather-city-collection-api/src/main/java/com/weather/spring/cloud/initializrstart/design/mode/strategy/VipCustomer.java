package com.weather.spring.cloud.initializrstart.design.mode.strategy;

import java.math.BigDecimal;

/**
 * @program: msa-weather-master
 * @description: This is Vip customer service has 7% off account
 * @author: W.HL
 * @create: 2019-03-27 16:45
 **/

public class VipCustomer implements StrategyService
{

    /**
     * get 5% off account prices by customer type
     *
     * @param money
     * @return
     */
    @Override
    public double getPrices(double money)
    {
        return new BigDecimal(money).multiply(new BigDecimal(0.70)).doubleValue();
    }

}
