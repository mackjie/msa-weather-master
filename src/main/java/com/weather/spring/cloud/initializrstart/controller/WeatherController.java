package com.weather.spring.cloud.initializrstart.controller;

import com.weather.spring.cloud.initializrstart.service.WeatherService;
import com.weather.spring.cloud.initializrstart.vo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: initializr-start
 * @description: The weather Controller management and request url
 * @author: W.HL
 * @create: 2019-01-03 17:30
 **/
@RequestMapping("/weather/api")
@RestController
public class WeatherController
{
    @Autowired
    private WeatherService weatherService;

    @GetMapping("cityId/{cityId}")
    public Weather getWeatherByCityId(@PathVariable("cityId") String cityId){
       return weatherService.getWeatherByCityId(cityId);
    }

    @GetMapping("cityName/{cityName}")
    public Weather getWeatherByCityName(@PathVariable("cityName") String cityName){
        return weatherService.getWeatherByCityName(cityName);
    }
}
