package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.CityList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: msa-weather-master
 * @description: This is city info api by feign client
 * @author: W.HL
 * @create: 2019-02-19 10:44
 **/

@FeignClient(name="${city.name}")
public interface CityClientService
{
    /**
     * get all the city info
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/city/api/getAllCity")
    CityList getAllCityData();

    /**
     * synchronize city data by city id
     * @param cityId
     */
    @RequestMapping(method = RequestMethod.GET,value = "/city/api/syncCityInfo/{cityId}")
    void citySyncDataByCityId(@PathVariable("cityId") String cityId);
}
