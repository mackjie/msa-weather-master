package com.weather.spring.cloud.initializrstart.service;

/**
 * @program: msa-weather-master
 * @description: This is a filer for student and return list
 * @author: W.HL
 * @create: 2019-04-24 20:59
 **/
@FunctionalInterface
public interface FilterStudent<T>
{
    boolean filterByCond(T t);

    default void filterByCond3(T t){
        System.out.println(t);
    };
}
