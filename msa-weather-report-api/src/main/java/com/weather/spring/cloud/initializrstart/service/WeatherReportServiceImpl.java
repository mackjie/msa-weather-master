package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.vo.City;
import com.weather.spring.cloud.initializrstart.vo.CityList;
import com.weather.spring.cloud.initializrstart.vo.Weather;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: msa-weather-report-api
 * @description: This is a weather api for that implement WeatherReportService
 * @author: W.HL
 * @create: 2019-01-07 17:05
 **/
@Service
public class WeatherReportServiceImpl implements WeatherReportService
{
    /**
     * get All City list
     *
     * @return
     */
    @Override
    public CityList getAllCityData()
    {
        /*TODO get the all city list from msa-weather-city-collection-aip*/
        CityList cityList = new CityList();
        List<City> list_t = new ArrayList<>();
        for (int i=0;i<5;i++){
            /*init city list*/
            City city = new City();
            city.setCityId((101010200+i)+"");
            city.setCityName("海淀区");
            list_t.add(city);
        }
        cityList.setCityList(list_t);
        return cityList;
    }
    /**
     * get the weather by city id
     *
     * @param cityId
     * @return
     */
    @Override
    public Weather getWeatherByCityId(String cityId)
    {
        /*TODO get the weather info by city id from msa-weather-server-api*/
        Weather weather = new Weather();
        Weather.DataBean data = new Weather.DataBean();
        data.setCity("海淀区");
        data.setGanmao("天气转凉，请注意保暖");
        data.setWendu("2°C");

        List<Weather.DataBean.ForecastBean> forecastBeans = new ArrayList<>();
        for (int i=0;i<4;i++){
            Weather.DataBean.ForecastBean forecastBean = new Weather.DataBean.ForecastBean();
            forecastBean.setFengli("三级风力");
            forecastBean.setFengxiang("西南风");
            forecastBean.setHigh("5°C");
            forecastBean.setLow("-2°C");
            forecastBeans.add(forecastBean);
        }
        data.setForecast(forecastBeans);
        weather.setData(data);
        return weather;
    }
    /**
     * get the weather by city mame
     *
     * @param cityName
     * @return
     */
    @Override
    public Weather getWeatherByCityName(String cityName)
    {
        /*TODO get the weather info by city name from msa-weather-server-api*/
        return null;
    }
}
