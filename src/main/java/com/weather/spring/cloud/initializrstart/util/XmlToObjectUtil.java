package com.weather.spring.cloud.initializrstart.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * @program: initializr-start
 * @description: This is a util to xml conver object
 * @author: W.HL
 * @create: 2019-01-04 10:30
 **/

public class XmlToObjectUtil
{

    /**
     * String xml  transform Object List
     * @param obj  transformed Object
     * @param strXml String xml
     * @return
     * @throws JAXBException
     * @throws IOException
     */
    public static Object xmlToObject(Class<?> obj, String strXml) throws JAXBException, IOException
    {

        /*xml transform object*/
        JAXBContext jaxbContext = JAXBContext.newInstance(obj);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Reader reader = new StringReader(strXml);
        Object objList = unmarshaller.unmarshal(reader);

        /*close the reader*/
        if(reader != null){
            reader.close();
        }
        return objList;
    }
}
