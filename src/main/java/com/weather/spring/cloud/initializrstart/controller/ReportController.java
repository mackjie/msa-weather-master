package com.weather.spring.cloud.initializrstart.controller;

import com.weather.spring.cloud.initializrstart.service.CityDataService;
import com.weather.spring.cloud.initializrstart.service.WeatherService;
import com.weather.spring.cloud.initializrstart.vo.City;
import com.weather.spring.cloud.initializrstart.vo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: initializr-start
 * @description: This is Report controller
 * @author: W.HL
 * @create: 2019-01-04 15:11
 **/

@RestController
@RequestMapping("/report")
public class ReportController
{
    @Autowired
    private WeatherService weatherService;
    @Autowired
    private CityDataService cityDataService;

    /**
     * get zhe city data weather info list
     * @param cityId
     * @param model
     * @return
     */
    @GetMapping("/cityId/{cityId}")
    public ModelAndView getReportListByCityId(@PathVariable("cityId") String cityId,Model model){
        /*get all the city list*/
      List<City> cityList = cityDataService.getAllCityData().getCityList();
      /*get the city weather info*/
        Weather weather = weatherService.getWeatherByCityId(cityId);
        model.addAttribute("title","实时天气预报");
        model.addAttribute("cityList",cityList);
        model.addAttribute("cityId",cityId);
        model.addAttribute("weather",weather);
        /*return the model and view weather info*/
        return new ModelAndView("weather/report","report",model);
    }
}
