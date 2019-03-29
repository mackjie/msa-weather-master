package com.weather.spring.cloud.initializrstart.design.mode.observer;

/**
 * @program: msa-weather-master
 * @description: This is observer by customer  service
 * @author: W.HL
 * @create: 2019-03-27 17:58
 **/

public interface ObservedService
{
    /**
     * add observer
     * @param customer
     */
    void addCustomer(Customer customer);

    /**
     * remove observer
     * @param customer
     */
    void removeCustomer(Customer customer);

    /**
     * update the good prices
     * @param money
     */
    void updatePrices(double money);
}
