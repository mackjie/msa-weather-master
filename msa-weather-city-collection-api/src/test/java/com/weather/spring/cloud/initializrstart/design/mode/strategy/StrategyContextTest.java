package com.weather.spring.cloud.initializrstart.design.mode.strategy;

import org.junit.Test;


public class StrategyContextTest
{
    @Test
    public void getPricesByDifferent(){
        StrategyService newCustomer = new NewCustomer();
        StrategyContext newContext = new StrategyContext(newCustomer);
        System.out.println("该新用户购买华为P20所需："+newContext.getPrices(3000.00)+"元");
        System.out.println("--------------------------------------------------------");

        StrategyService commonCustomer = new CommonCustomer();
        StrategyContext commonContext = new StrategyContext(commonCustomer);
        System.out.println("该普通用户购买华为P20所需："+commonContext.getPrices(3000.00)+"元");
        System.out.println("--------------------------------------------------------");

        StrategyService vipCustomer = new VipCustomer();
        StrategyContext vipContext = new StrategyContext(vipCustomer);
        System.out.println("该会员用户购买华为P20所需："+vipContext.getPrices(3000.00)+"元");
        System.out.println("--------------------------------------------------------");

        StrategyService svipCustomer = new SvipCustomer();
        StrategyContext svipContext = new StrategyContext(svipCustomer);
        System.out.println("该尊享会员用户购买华为P20所需："+svipContext.getPrices(3000.00)+"元");
        System.out.println("--------------------------------------------------------");
    }
}
