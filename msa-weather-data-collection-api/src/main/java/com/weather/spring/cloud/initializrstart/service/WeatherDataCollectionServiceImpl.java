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
 * @description: This is a implement for WeatherDataCollectionService
 * @author: W.HL
 * @create: 2019-01-07 15:12
 **/
@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService
{

    private Logger logger = LoggerFactory.getLogger(WeatherDataCollectionServiceImpl.class);

    private static final int ERROR_CODE = 200;

    @Value("${weather.url}")
    private String weatherUrl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * the weather data collection by city id and save that to redis
     *
     * @param cityId
     */
    @Override
    public Weather weatherDataSyncByCityId(String cityId)
    {
        /*splice the weather complete url*/
        String weatherUrlCityId = weatherUrl+"citykey="+cityId;
        Weather weather = getWeatherByUrl(weatherUrlCityId);
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
            if(ERROR_CODE == resp.getStatusCodeValue())
            {
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
