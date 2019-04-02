package com.weather.spring.cloud.initializrstart.design.mode.factory.abstractf;

import lombok.SneakyThrows;

/**
 * @program: msa-weather-master
 * @description: This is a factory service for creating car or tv
 * @author: W.HL
 * @create: 2019-04-02 09:49
 **/

public class FactoryProductService
{
    @SneakyThrows(Exception.class)
    public static Factory getFactory(String cityName){
        switch (cityName){
            case "USA": return new UsaFactory();
            case "CHINA" : return new ChineseFactory();
            default: new Exception("not find this factory");
        }
        return  null;
    }

    public static void main(String[] args)
    {
        FactoryProductService.getFactory("CHINA").getTv();
        FactoryProductService.getFactory("CHINA").getCar();

        FactoryProductService.getFactory("USA").getTv();
        FactoryProductService.getFactory("USA").getCar();
    }
}
