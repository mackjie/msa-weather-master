package com.weather.spring.cloud.initializrstart.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.spring.cloud.initializrstart.vo.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Weather getWeatherByCityId(String cityId)
    {
        /*splice the weather complete url*/
        String WEATHER_URI_CITY_ID = weatherUrl+"citykey="+cityId;
        Weather weather = getWeatherByUrl(WEATHER_URI_CITY_ID);
        return weather;
    }


    @Override
    public Weather getWeatherByCityName(String cityName)
    {
        /*splice the weather complete url*/
        String WEATHER_URI_CITY_NAME= weatherUrl+"city="+cityName;

        /*get the conver type*/
        Weather weather = getWeatherByUrl(WEATHER_URI_CITY_NAME);
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
            logger.info("The weather does not have  in redis and put the weather info join the redis");
            /*request the weather url*/
            ResponseEntity<String> resp = restTemplate.getForEntity(uri,String.class);
            /*judge the response error code and success is 200*/
            if(resp.getStatusCodeValue() == 200){
                respBody = resp.getBody();
            }
            /*put the value into redis*/
            ops.set(uri,respBody);
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
