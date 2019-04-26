package com.weather.spring.cloud.initializrstart.design.mode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: msa-weather-master
 * @description: This is jdk8 new function
 * @author: W.HL
 * @create: 2019-04-21 15:54
 **/

public class lambda
{
    @Test
    public void lambdaTest(){
        Arrays.asList("a","d","e","b").forEach((String x) -> System.out.println(x));
    }

    @Test
    public void lambdaSort(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("b");
        list.sort(String::compareTo);
        list.forEach((String str)-> System.out.println(str));
    }
}
