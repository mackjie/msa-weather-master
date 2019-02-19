package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.City;
import com.weather.spring.cloud.initializrstart.vo.CityList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: msa-weather-master
 * @description: This is about city service api by feignClient
 * @author: W.HL
 * @create: 2019-02-18 17:17
 **/

@FeignClient(name="${city.name}")
public interface CityClientService
{

    /**
     * get all the city info
     * @return CityList
     */
    @RequestMapping(method = RequestMethod.GET,value = "/city/api/getAllCity")
    CityList getAllCityData();

    /**
     * synchronize city data by city id
     * @param cityId
     */
    @RequestMapping(method = RequestMethod.GET,value = "/syncCityInfo/{cityId}", consumes = "application/json")
    void citySyncDataByCityId(@PathVariable("cityId") String cityId);

    /**
     * This is test transport param from POJO
     * @param city
     * @return CityList
     */
    @RequestMapping(method = RequestMethod.POST,value = "/city/api/test",consumes = "application/json")
    CityList getTest(@RequestBody City city);
}
