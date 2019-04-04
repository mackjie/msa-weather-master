package com.weather.spring.cloud.initializrstart.design.mode.proxy.staticproxy;

import java.io.PrintStream;
import java.util.Date;

/**
 * @program: msa-weather-master
 * @description: Thi is agent person for star people
 * @author: W.HL
 * @create: 2019-04-04 10:11
 **/

public class AgentPerson implements Star
{
    private Star star;

    public AgentPerson(Star star)
    {
        this.star = star;
    }
    /**
     * star person name
     */
    @Override
    public void starName()
    {
        star.starName();
    }
    /**
     * person Performance
     *
     * @param time
     */
    @Override
    public void showTime(Date time)
    {
        star.showTime(time);
    }

    public static void main(String[] args)
    {
        /*get the star*/
        Star agentPerson = new AgentPerson(new HuGe());
        agentPerson.starName();
        agentPerson.showTime(new Date());
    }
}
