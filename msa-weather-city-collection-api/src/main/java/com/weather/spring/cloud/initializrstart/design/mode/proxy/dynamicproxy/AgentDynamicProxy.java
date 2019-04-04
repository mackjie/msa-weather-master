package com.weather.spring.cloud.initializrstart.design.mode.proxy.dynamicproxy;



import com.weather.spring.cloud.initializrstart.design.mode.proxy.staticproxy.HuGe;
import com.weather.spring.cloud.initializrstart.design.mode.proxy.staticproxy.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @program: msa-weather-master
 * @description: This is star dynamic proxy
 * @author: W.HL
 * @create: 2019-04-04 10:26
 **/

public class AgentDynamicProxy implements InvocationHandler
{
    private Object object;

    public AgentDynamicProxy(Object object)
    {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        return method.invoke(object,args);
    }

    public static void main(String[] args)
    {
        /*获取代理对象*/
        InvocationHandler invocationHandler = new AgentDynamicProxy(new HuGe());

        /*创建动态代理对象*/
       Star star = (Star) Proxy.newProxyInstance(new HuGe().getClass().getClassLoader(),new Class[]{Star.class},invocationHandler);
       star.starName();
       star.showTime(new Date());

    }
}
