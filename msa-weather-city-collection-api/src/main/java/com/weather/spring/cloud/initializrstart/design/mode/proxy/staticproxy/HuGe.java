package com.weather.spring.cloud.initializrstart.design.mode.proxy.staticproxy;


import java.text.DateFormat;
import java.util.Date;

/**
 * @program: msa-weather-master
 * @description: Thi is HuGe class
 * @author: W.HL
 * @create: 2019-04-04 10:04
 **/

public class HuGe implements Star
{

    @Override
    public void starName()
    {
        System.out.println("大家好！ 我是胡歌");
    }

    /**
     * person Performance
     */
    @Override
    public void showTime(Date time)
    {
        System.out.println("最近演出时间为："+DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(time));
    }
}
