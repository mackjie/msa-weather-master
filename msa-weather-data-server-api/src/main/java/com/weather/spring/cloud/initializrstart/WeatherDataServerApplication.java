package com.weather.spring.cloud.initializrstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;

/**
 * @author 17890
 */
@SpringBootApplication
public class WeatherDataServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataServerApplication.class, args);
	}


}

