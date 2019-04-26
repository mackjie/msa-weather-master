package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.Weather;

/**
 * @program: initializr-start
 * @description: The weather service ApI
 * @author: W.HL
 * @create: 2019-01-03 16:52
 **/
public interface WeatherService
{

    /**
     * get the weather info by city id
     * @param cityId
     * @return
     */
    Weather getWeatherByCityId(String cityId);

    /**
     * get The weather info by city name
     * @param cityName
     * @return
     */
    Weather getWeatherByCityName(String cityName);

}
