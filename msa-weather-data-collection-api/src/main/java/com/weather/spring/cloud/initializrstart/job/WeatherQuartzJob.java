package com.weather.spring.cloud.initializrstart.job;

import com.weather.spring.cloud.initializrstart.service.CityClientService;
import com.weather.spring.cloud.initializrstart.service.WeatherDataCollectionService;
import com.weather.spring.cloud.initializrstart.vo.City;
import com.weather.spring.cloud.initializrstart.vo.CityList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: initializr-start
 * @description: This is a quartz job to refresh the weather data list in redis
 * @author: W.HL
 * @create: 2019-01-03 19:49
 **/

public class WeatherQuartzJob extends QuartzJobBean
{
    private Logger logger = LoggerFactory.getLogger(WeatherQuartzJob.class);

    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;
    @Autowired
    private CityClientService cityClientService;

    @Override
    protected void executeInternal(org.quartz.JobExecutionContext context)
    {
       logger.info("This is a quartz job to refresh the weather Starting");

        /*get all city data*/
        CityList cityList = cityClientService.getAllCityData();

        for(City city : cityList.getCityList()){
            //sync data the city weather
            weatherDataCollectionService.weatherDataSyncByCityId(city.getCityId());
       }

        logger.info("This is a quartz job to refresh the weather Ending");
    }
}
