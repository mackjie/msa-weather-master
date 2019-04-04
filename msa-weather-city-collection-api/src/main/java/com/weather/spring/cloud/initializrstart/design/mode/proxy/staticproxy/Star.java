package com.weather.spring.cloud.initializrstart.design.mode.proxy.staticproxy;

import java.util.Date;

/**
 * @program: msa-weather-master
 * @description: This is  all star people service
 * @author: W.HL
 * @create: 2019-04-04 10:03
 **/

public interface Star
{
    /**
     *  star person name
     */
    void starName();

    /**
     * person Performance
     */
    void showTime(Date time);
}
