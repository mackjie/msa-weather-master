package com.weather.spring.cloud.initializrstart.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: initializr-start
 * @description: This is City data Pojo
 * @author: W.HL
 * @create: 2019-01-04 10:20
 **/
public @Data class City
{
    /**
     * city id
     */
    @Setter @Getter private String cityId;

    /**
     * city district ege:海定区
     */
    @Setter @Getter private String cityDistrict;

    /**
     * city district English name
     */
    @Setter @Getter private String cityDesc;

    /**
     * city name
     */
   @Setter @Getter private String cityName;

}
