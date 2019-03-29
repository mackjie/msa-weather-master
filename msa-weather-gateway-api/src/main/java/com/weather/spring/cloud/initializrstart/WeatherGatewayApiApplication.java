package com.weather.spring.cloud.initializrstart;

import com.weather.spring.cloud.initializrstart.filter.RequestLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author 17890
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class WeatherGatewayApiApplication
{

	public static void main(String[] args) {
		SpringApplication.run(WeatherGatewayApiApplication.class, args);
	}

	@Bean
	public RequestLogFilter getRequestFilter(){
		return new RequestLogFilter();
	}
}

