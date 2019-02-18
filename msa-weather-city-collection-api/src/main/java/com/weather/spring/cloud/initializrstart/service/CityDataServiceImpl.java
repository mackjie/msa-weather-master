package com.weather.spring.cloud.initializrstart.service;

import com.weather.spring.cloud.initializrstart.util.XmlToObjectUtil;
import com.weather.spring.cloud.initializrstart.vo.CityList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: initializr-start
 * @description: This is a all city data APi implement CityDataService
 * @author: W.HL
 * @create: 2019-01-04 10:49
 **/
@Service
public class CityDataServiceImpl implements  CityDataService
{
    private static final Logger logger  = LoggerFactory.getLogger(CityDataServiceImpl.class);

    @Value("${weather.url}")
    private String weatherUrl;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RestTemplate restTemplate;
    /**
     * get all the city info
     *
     * @return
     */
    @Override
    public CityList getAllCityData()
    {
        /*get the city xml resource*/
        Resource resource = new ClassPathResource("citylist.xml");
        CityList cityList = null;
        /*read the file */
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(),"utf-8"));
            String readXml;
            StringBuffer sb = new StringBuffer();
            while((readXml = br.readLine()) != null){
                sb.append(readXml);
            }
            br.close();
            /*String xml transform to Object*/
            String xmlStr = sb.toString().split("<xml>")[1].split("</xml>")[0];
            cityList = (CityList) XmlToObjectUtil.xmlToObject(CityList.class,xmlStr);
        }
        catch (Exception e)
        {
            logger.error("Exception:",e);
        }
        return cityList;
    }

    /**
     * @param cityId
     */
    @Override
    public void citySyncDataByCityId(String cityId)
    {
        String uri = weatherUrl+"citykey="+cityId;
        logger.info("当前url={}",uri);
        /*get the redis Object */
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        /*request the weather url*/
        ResponseEntity<String> resp = restTemplate.getForEntity(uri,String.class);
        /*judge the response error code and success is 200*/
        if(resp.getStatusCodeValue() == 200){
            String respBody = resp.getBody();
            /*put the value into redis*/
            ops.set(uri,respBody);
        }
    }
}
