package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.dao.Student;

import java.math.BigDecimal;

/**
 * @program: msa-weather-master
 * @description: This is filter student by fee
 * @author: W.HL
 * @create: 2019-04-24 21:02
 **/

public class FilterFeeStudentImpl implements FilterStudent<Student>
{
    private static final BigDecimal feeLit = new BigDecimal("18000.99");

    @Override
    public boolean filterByCond(Student student)
    {
        return student.getStudyFee().compareTo(feeLit)>1?true:false;
    }
}
