package com.weather.spring.cloud.initializrstart.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: initializr-start
 * @description: The Vo is all city data
 * @author: W.HL
 * @create: 2019-01-04 10:28
 **/
@XmlRootElement(name="c")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList
{
    @XmlElement(name="d")
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
