package com.weather.spring.cloud.initializrstart.design.mode.observer;

import org.junit.Test;

public class ObserverModeContextTest
{
    @Test
    public void observerTest(){
        Customer customer_1 = new Customer("张无忌","13693545297");

        Customer customer_2 = new Customer("赵敏","13693545296");

        Customer customer_3 = new Customer("周芷若","13693545295");

        Customer customer_4 = new Customer("杨不悔","13693545294");

        ObservedService observedContext = new SubjectContext(1999.00,"华为P20");
        /*添加观察者*/
        observedContext.addCustomer(customer_1);
        observedContext.addCustomer(customer_2);
        observedContext.addCustomer(customer_3);
        observedContext.addCustomer(customer_4);
        ((SubjectContext) observedContext).setObserverContext(new ObserverContext());
        /*被观察者产品价格产生变动*/
        observedContext.updatePrices(1899.00);

        /*取消关注*/
        observedContext.removeCustomer(customer_4);

        observedContext.updatePrices(1799.00);
    }
}
