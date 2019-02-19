package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: msa-weather-master
 * @description: This is weather api by feign client
 * @author: W.HL
 * @create: 2019-02-19 10:37
 **/

@FeignClient(name="${weather.name}")
public interface WeatherClientService
{
    /**
     * get the weather info by city id
     * @param cityId
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/weather/api/cityId/{cityId}")
    Weather getWeatherByCityId(@PathVariable("cityId") String cityId);

    /**
     * get The weather info by city name
     * @param cityName
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/weather/api/cityName/{cityName}")
    Weather getWeatherByCityName(@PathVariable("cityName") String cityName);
}
