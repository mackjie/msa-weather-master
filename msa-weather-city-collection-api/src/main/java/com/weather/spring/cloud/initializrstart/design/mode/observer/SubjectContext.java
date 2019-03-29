package com.weather.spring.cloud.initializrstart.design.mode.observer;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: msa-weather-master
 * @description: This is a observed service for the customer
 * @author: W.HL
 * @create: 2019-03-28 10:34
 **/

public class SubjectContext implements ObservedService
{
    /**
     * the observed sell price
     */
    @Setter @Getter private double sellPrice;

    /**
     * the observed good name
     */
    @Setter @Getter private String goodName;

    private List<Customer> observerList = new ArrayList<>();

    @Setter @Getter private ObserverContext observerContext;

    /**
     * add observer
     *
     * @param customer
     */
    @Override
    public void addCustomer(Customer customer)
    {
        observerList.add(customer);
    }

    /**
     * remove observer
     *
     * @param customer
     */
    @Override
    public void removeCustomer(Customer customer)
    {
        if(observerList.contains(customer)){
            observerList.remove(customer);
        }
    }

    /**
     * update the good prices
     *
     * @param money
     */
    @Override
    public void updatePrices(double money)
    {
        if(new BigDecimal(sellPrice).compareTo(new BigDecimal(money)) == 1){
            /*if sell price < update money then notify all the observer customer*/
            System.out.println("*****************产品降价大促销开始了*****************");
            observerContext.noticeCustomer(observerList);
        }

        this.setSellPrice(money);
    }

    public SubjectContext(double sellPrice, String goodName)
    {
        this.sellPrice = sellPrice;
        this.goodName = goodName;
    }
}
