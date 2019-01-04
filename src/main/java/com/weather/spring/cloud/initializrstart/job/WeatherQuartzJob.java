package com.weather.spring.cloud.initializrstart.job;

import com.weather.spring.cloud.initializrstart.service.CityDataService;
import com.weather.spring.cloud.initializrstart.vo.City;
import com.weather.spring.cloud.initializrstart.vo.CityList;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

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
    private CityDataService cityDataService;

    @Override
    protected void executeInternal(org.quartz.JobExecutionContext context) throws JobExecutionException
    {
       logger.info("This is a quartz job to refresh the weather Starting");

        /*get all city data*/
       CityList list = cityDataService.getAllCityData();
       if(list == null ){
           return;
       }
       for(City city : list.getCityList()){
           /* sync data the city weather*/
           cityDataService.citySyncDataByCityId(city.getCityId());
       }


       logger.info("This is a quartz job to refresh the weather Ending");
    }
}
