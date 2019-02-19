package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.City;
import com.weather.spring.cloud.initializrstart.vo.CityList;
import com.weather.spring.cloud.initializrstart.vo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: msa-weather-report-api
 * @description: This is a weather api for that implement WeatherReportService
 * @author: W.HL
 * @create: 2019-01-07 17:05
 **/
@Service
public class WeatherReportServiceImpl implements WeatherReportService
{
    @Autowired
    private CityClientService cityClientService;
    @Autowired
    private WeatherClientService weatherClientService;
    /**
     * get All City list
     *
     * @return
     */
    @Override
    public CityList getAllCityData()
    {
        CityList cityList = cityClientService.getAllCityData();
        City city = new City();
        city.setCityName("asdfasdf");
        CityList cityList_t = cityClientService.getTest(city);
        return cityList;
    }
    /**
     * get the weather by city id
     *
     * @param cityId
     * @return
     */
    @Override
    public Weather getWeatherByCityId(String cityId)
    {
        Weather weather = weatherClientService.getWeatherByCityId(cityId);
        return weather;
    }
    /**
     * get the weather by city mame
     *
     * @param cityName
     * @return
     */
    @Override
    public Weather getWeatherByCityName(String cityName)
    {
        Weather weather = weatherClientService.getWeatherByCityName(cityName);
        return weather;
    }
}
