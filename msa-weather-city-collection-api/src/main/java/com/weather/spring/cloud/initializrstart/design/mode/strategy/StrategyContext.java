package com.weather.spring.cloud.initializrstart.design.mode.strategy;

/**
 * @program: msa-weather-master
 * @description: This is a strategy for get the prices context
 * @author: W.HL
 * @create: 2019-03-27 17:15
 **/

public class StrategyContext
{
    private StrategyService strategyService;

    public StrategyContext(StrategyService strategyService)
    {
        this.strategyService = strategyService;
    }

    public double getPrices(double money){
        return strategyService.getPrices(money);
    }
}
