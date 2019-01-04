package com.weather.spring.cloud.initializrstart.config;

import com.weather.spring.cloud.initializrstart.job.WeatherQuartzJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: initializr-start
 * @description: Create the quartzJob Bean
 * @author: W.HL
 * @create: 2019-01-03 19:54
 **/
@Configuration
public class WeatherSyncJobBuild
{
    @Bean
    public JobDetail weatherSyncJobDetail(){
        /*create the jobDetail*/
        return  JobBuilder.newJob(WeatherQuartzJob.class).withIdentity("weatherSyncJobDetail").storeDurably().build();
    }


    @Bean
    public Trigger weatherSyncTrigger(){
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();
        /*create trigger*/
       return TriggerBuilder.newTrigger().forJob(weatherSyncJobDetail()).withIdentity("weatherSyncTrigger").withSchedule(scheduleBuilder).build();
    }
}
