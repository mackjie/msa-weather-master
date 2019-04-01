package com.weather.spring.cloud.initializrstart.design.mode.decorate;

/**
 * @program: msa-weather-master
 * @description: This is camera feature in mobile
 * @author: W.HL
 * @create: 2019-03-29 14:58
 **/

public class MailFeature extends FeatureService
{
    private Mobile mobile;

    public MailFeature(Mobile mobile)
    {
        this.mobile = mobile;
    }
    /**
     * desc something
     */
    @Override
    public String getDesc()
    {
        return mobile.getDesc()+"\n新增邮件功能";
    }
}
