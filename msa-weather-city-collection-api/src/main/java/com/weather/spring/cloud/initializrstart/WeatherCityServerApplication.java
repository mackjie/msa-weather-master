package com.weather.spring.cloud.initializrstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 17890
 */
@SpringBootApplication
@EnableDiscoveryClient
@ConfigurationProperties
public class WeatherCityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherCityServerApplication.class, args);
	}

}

