package com.weather.spring.cloud.initializrstart.design.mode.observer;

import java.util.List;

/**
 * @program: msa-weather-master
 * @description: This is observer service that the good observerd by customer
 * @author: W.HL
 * @create: 2019-03-28 10:41
 **/

public interface ObserverService
{
    /**
     * notice the all customer that observer the good by customer
     * @param list
     */
    void noticeCustomer(List<Customer> list);
}
