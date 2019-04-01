package com.weather.spring.cloud.initializrstart.design.mode.factory.simplef;

import lombok.SneakyThrows;

/**
 * @program: msa-weather-master
 * @description: This is factory for creating car
 * @author: W.HL
 * @create: 2019-04-01 14:17
 **/

public class SimpleDesignFactory
{

    @SneakyThrows(Exception.class)
    public static void createCar(String carName){
        switch (carName){
            case "BM" :  new BMCarServiceImpl().createCar(); break;
            case "BC" :  new BCCarServiceImpl().createCar(); break;
            case "AD" :  new ADCarServiceImpl().createCar(); break;
            default: throw new Exception("没有该类型车型");
        }
    }

    public static void main(String[] args)
    {
        SimpleDesignFactory.createCar("AD");
    }

    @SneakyThrows(Exception.class)
    public static CarService create(Class c){
        /*利用反射机制获取对象 直接进行返回*/
        CarService car = (CarService) Class.forName(c.getName()).newInstance();
        /*缺点需要一个完整的类名 并且不能含有重复的类名 即完整类名的绝对路径*/
        return car;
    }
}
