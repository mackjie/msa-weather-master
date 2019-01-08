package com.weather.spring.cloud.initializrstart.vo;


/**
 * @program: initializr-start
 * @description: This is City data Pojo
 * @author: W.HL
 * @create: 2019-01-04 10:20
 **/
public class City
{
    /**
     * city id
     */
    private String cityId;

    /**
     * city district ege:海定区
     */
    private String cityDistrict;

    /**
     * city district English name
     */
    private String cityDesc;

    /**
     * city name
     */
    private String cityName;

    public String getCityId()
    {
        return cityId;
    }
    public void setCityId(String cityId)
    {
        this.cityId = cityId;
    }
    public String getCityDistrict()
    {
        return cityDistrict;
    }
    public void setCityDistrict(String cityDistrict)
    {
        this.cityDistrict = cityDistrict;
    }
    public String getCityDesc()
    {
        return cityDesc;
    }
    public void setCityDesc(String cityDesc)
    {
        this.cityDesc = cityDesc;
    }
    public String getCityName()
    {
        return cityName;
    }
    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }
}
