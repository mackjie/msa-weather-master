package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.Weather;

/**
 * @program: WeatherDataCollectionService
 * @description: This ia microservice for collection the weather data api
 * @author: W.HL
 * @create: 2019-01-07 15:07
 **/

public interface WeatherDataCollectionService
{

    /**
     * the weather data collection by city id and save that to redis
     * @param cityId
     */
    Weather weatherDataSyncByCityId(String cityId);
}
