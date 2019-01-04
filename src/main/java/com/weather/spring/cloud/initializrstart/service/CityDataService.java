package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.CityList;

/**
 * @program: initializr-start
 * @description: This is  all city service api
 * @author: W.HL
 * @create: 2019-01-04 10:47
 **/

public interface CityDataService
{

    /**
     * get all the city info
     * @return
     */
    CityList getAllCityData();

    /**
     * synchronize city data by city id
     * @param cityId
     */
    void citySyncDataByCityId(String cityId);
}
