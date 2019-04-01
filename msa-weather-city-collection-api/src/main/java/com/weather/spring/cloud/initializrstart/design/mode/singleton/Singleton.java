package com.weather.spring.cloud.initializrstart.design.mode.singleton;

/**
 * @program: msa-weather-master
 * @description: This is a singleton design mode demo
 * @author: W.HL
 * @create: 2019-03-29 17:38
 **/

public class Singleton
{
    private static Singleton instance = null;

    /**
     * 构造方法私有 其他地方不能直接创建这个对象
     */
    private Singleton()
    {
    }


    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
