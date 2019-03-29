package com.weather.spring.cloud.initializrstart.design.mode.observer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: msa-weather-master
 * @description:
 * @author: W.HL
 * @create: 2019-03-28 10:30
 **/

public @Data class Customer
{
    /**
     * the member name
     */
    @Setter @Getter private String name;

    /**
     * the member mobile
     */
    @Setter @Getter private String mobile;

    public Customer(String name, String mobile)
    {
        this.name = name;
        this.mobile = mobile;
    }
}
