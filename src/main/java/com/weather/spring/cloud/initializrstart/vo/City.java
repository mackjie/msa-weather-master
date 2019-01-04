package com.weather.spring.cloud.initializrstart.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: initializr-start
 * @description: This is City data Pojo
 * @author: W.HL
 * @create: 2019-01-04 10:20
 **/
@XmlRootElement(name="d")
@XmlAccessorType(XmlAccessType.FIELD)
public class City
{
    /**
     * city id
     */
    @XmlAttribute(name="d1")
    private String cityId;

    /**
     * city district ege:海定区
     */
    @XmlAttribute(name="d2")
    private String cityDistrict;

    /**
     * city district English name
     */
    @XmlAttribute(name="d3")
    private String cityDesc;

    /**
     * city name
     */
    @XmlAttribute(name="d4")
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
