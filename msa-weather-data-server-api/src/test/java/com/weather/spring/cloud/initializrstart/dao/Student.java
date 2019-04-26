package com.weather.spring.cloud.initializrstart.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @program: msa-weather-master
 * @description:
 * @author: W.HL
 * @create: 2019-04-24 20:33
 **/

@AllArgsConstructor
@NoArgsConstructor
public @Data class Student
{
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 学费
     */
    private BigDecimal studyFee;
}
