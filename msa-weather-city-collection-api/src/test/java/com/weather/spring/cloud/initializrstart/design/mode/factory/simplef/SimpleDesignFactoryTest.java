package com.weather.spring.cloud.initializrstart.design.mode.factory.simplef;

import org.junit.Test;

public class SimpleDesignFactoryTest
{
    @Test
    public void simpleDesignTest(){
        /*创建宝马*/
        CarService bmCar = SimpleDesignFactory.create(BMCarServiceImpl.class);
        bmCar.createCar();

        /*创建奔驰*/
        CarService bcCar = SimpleDesignFactory.create(BCCarServiceImpl.class);
        bcCar.createCar();

        /*创建奥迪*/
        CarService adCar = SimpleDesignFactory.create(ADCarServiceImpl.class);
        adCar.createCar();
    }
}
