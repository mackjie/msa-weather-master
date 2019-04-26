package com.weather.spring.cloud.initializrstart.service;

/**
 * @program: msa-weather-master
 * @description: This is lambda inteface for jdk 1.8 new function functionalInterface
 * @author: W.HL
 * @create: 2019-04-21 16:23
 **/
@FunctionalInterface
public interface LambdaService
{
    /**
     * for lambda test
     */
    void lambda();

    /**
     * from lambda test2
     */
    default void lambda2()
    {
        System.out.println("come in LambdaService");
    }
}
