package com.weather.spring.cloud.initializrstart.design.mode.decorate;

import org.junit.Test;


public class DecorateTest
{
    @Test
    public void decorateTest(){
        Mobile samsung = new SamsungMobile();

        Mobile iphone = new AppleMobile();

        /*增加相机功能*/
        FeatureService featureService =  new CameraFeature(samsung);

        featureService = new MailFeature(featureService);
        System.out.println(featureService.getDesc());
        System.out.println("******************************************");

        featureService = new MailFeature(iphone);
        featureService =  new CameraFeature(featureService);
        featureService =  new HealthFeature(featureService);
        System.out.println(featureService.getDesc());

    };
}
