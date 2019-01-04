package com.weather.spring.cloud.initializrstart.job;

import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    @Override
    protected void executeInternal(org.quartz.JobExecutionContext context) throws JobExecutionException
    {
        logger.info("This is a quartz job to refresh the weather data list in redis and Synchronize the data");
    }
}
