package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.dao.Student;

/**
 * @program: msa-weather-master
 * @description: This is filter student by age
 * @author: W.HL
 * @create: 2019-04-24 21:02
 **/

public class FilterAgeStudentImpl implements FilterStudent<Student>
{
    private static final int ageLit = 40;

    @Override
    public boolean filterByCond(Student student)
    {
        return student.getAge()>ageLit?true:false;
    }
}
