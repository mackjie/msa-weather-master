package com.weather.spring.cloud.initializrstart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: initializr-start
 * @description: The basic config Vo
 * @author: W.HL
 * @create: 2019-01-03 16:59
 **/
@Configuration
public class ConfigurationVo
{
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Bean
    public RestTemplate getRestTemplate(){
        return  restTemplateBuilder.build();
    }
}
