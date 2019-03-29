package com.weather.spring.cloud.initializrstart.design.mode.observer;

import java.util.List;

/**
 * @program: msa-weather-master
 * @description: This is all customer that observer the good by prices update
 * @author: W.HL
 * @create: 2019-03-28 10:44
 **/

public class ObserverContext implements ObserverService
{

    /**
     * notice the all customer that observer the good by customer
     *
     * @param list
     */
    @Override
    public void noticeCustomer(List<Customer> list)
    {
        list.forEach(customer -> {
            System.out.println(customer.getName()+"! 您好，您关注的华为P20手机终于降价了，请尽快购买");
            System.out.println("--------------------------------------------------------------");
        });
    }
}
