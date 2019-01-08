package com.weather.spring.cloud.initializrstart.vo;

import java.util.List;

/**
 * @program: initializr-start
 * @description: The Vo is all city data
 * @author: W.HL
 * @create: 2019-01-04 10:28
 **/
public class CityList
{
    private List<City> cityList;

    public List<City> getCityList()
    {
        return cityList;
    }
    public void setCityList(List<City> cityList)
    {
        this.cityList = cityList;
    }
}
