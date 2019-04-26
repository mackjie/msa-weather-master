package com.weather.spring.cloud.initializrstart.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.spring.cloud.initializrstart.vo.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @program: initializr-start
 * @description:
 * @author: W.HL
 * @create: 2019-01-03 16:57
 **/
@Service
public class WeatherServiceImpl implements WeatherService
{
    private Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);

    @Value("${weather.url}")
    private String weatherUrl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Weather getWeatherByCityId(String cityId)
    {
        /*splice the weather complete url*/
        String weatherUrlCityId = weatherUrl+"citykey="+cityId;
        Weather weather = getWeatherByUrl(weatherUrlCityId);
        return weather;
    }


    @Override
    public Weather getWeatherByCityName(String cityName)
    {
        /*splice the weather complete url*/
        String weatherUrlCityName= weatherUrl+"city="+cityName;

        /*get the conver type*/
        Weather weather = getWeatherByUrl(weatherUrlCityName);
        return weather;
    }

    /**
     * get the weather info by url
     * @param uri
     * @return
     */
    private Weather getWeatherByUrl(String uri)
    {
        /*get the redis Object */
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        /*get the conver type*/
        ObjectMapper objectMapper = new ObjectMapper();
        String respBody = null;
        /*judge the weather info had join the redis cache data*/
        if(stringRedisTemplate.hasKey(uri)){
            logger.info("The weather had join in redis and return the message use redis");
            /*search the weather info from redis*/
             respBody =  ops.get(uri);
        }else{
            throw new RuntimeException("The weather does not join in redis and return null");
        }
        Weather weather = null;
        try
        {
            weather =  objectMapper.readValue(respBody,Weather.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            logger.error("error",e);
        }
        return weather;
    }


}
