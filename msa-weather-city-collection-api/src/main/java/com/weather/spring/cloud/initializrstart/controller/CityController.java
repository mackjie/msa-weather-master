package com.weather.spring.cloud.initializrstart.controller;

import com.weather.spring.cloud.initializrstart.service.CityDataService;
import com.weather.spring.cloud.initializrstart.vo.City;
import com.weather.spring.cloud.initializrstart.vo.CityList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: initializr-start
 * @description: The weather Controller management and request url
 * @author: W.HL
 * @create: 2019-01-03 17:30
 **/
@RequestMapping("/city/api")
@RestController
public class CityController
{
    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private CityDataService cityDataService;

    /**
     * search the all city list info
     * @return
     */
    @RequestMapping("/getAllCity")
    public CityList getAllCity(){
       return cityDataService.getAllCityData();
    }

    /**
     * synchronized city weather info by city id
     * @param cityId
     */
    @RequestMapping("/syncCityInfo/{cityId}")
    public void syncCityInfoByCityId(@PathVariable("cityId") String cityId){
        cityDataService.citySyncDataByCityId(cityId);
    }

    @RequestMapping("/test")
    public CityList getTest(@RequestBody City city){
        logger.info("当前参数为：{}",city);
        return null;
    }
}
