package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.CityList;
import com.weather.spring.cloud.initializrstart.vo.Weather;


/**
 * @program: msa-weather-report-api
 * @description: This is a weather Web  api
 * @author: W.HL
 * @create: 2019-01-07 17:02
 **/

public interface WeatherReportService
{
    /**
     * get All City list
     * @return
     */
    CityList getAllCityData();

    /**
     * get the weather by city id
     * @param cityId
     * @return
     */
    Weather getWeatherByCityId(String cityId);

    /**
     * get the weather by city mame
     * @param cityName
     * @return
     */
    Weather getWeatherByCityName(String cityName);
}
