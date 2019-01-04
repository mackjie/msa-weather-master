package com.weather.spring.cloud.initializrstart.vo;

import java.util.List;

/**
 * @program: initializr-start
 * @description: The china weather model
 * @author: W.HL
 * @create: 2019-01-03 16:16
 **/

public class Weather
{

    /**
     * data : {"yesterday":{"date":"2日星期三","high":"高温 7℃","fx":"北风","low":"低温 4℃","fl":"<![CDATA[3-4级]]>","type":"多云"},"city":"上海","forecast":[{"date":"3日星期四","high":"高温 10℃","fengli":"<![CDATA[3-4级]]>","low":"低温 7℃","fengxiang":"东北风","type":"多云"},{"date":"4日星期五","high":"高温 10℃","fengli":"<![CDATA[3-4级]]>","low":"低温 8℃","fengxiang":"东风","type":"小雨"},{"date":"5日星期六","high":"高温 9℃","fengli":"<![CDATA[3-4级]]>","low":"低温 7℃","fengxiang":"东北风","type":"小雨"},{"date":"6日星期天","high":"高温 8℃","fengli":"<![CDATA[3-4级]]>","low":"低温 3℃","fengxiang":"北风","type":"多云"},{"date":"7日星期一","high":"高温 10℃","fengli":"<![CDATA[<3级]]>","low":"低温 6℃","fengxiang":"东风","type":"小雨"}],"ganmao":"天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。","wendu":"8"}
     * status : 1000
     * desc : OK
     */

    private DataBean data;
    private int status;
    private String desc;
    public DataBean getData()
    {
        return data;
    }
    public void setData(DataBean data)
    {
        this.data = data;
    }
    public int getStatus()
    {
        return status;
    }
    public void setStatus(int status)
    {
        this.status = status;
    }
    public String getDesc()
    {
        return desc;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
    public static class DataBean
    {
        /**
         * yesterday : {"date":"2日星期三","high":"高温 7℃","fx":"北风","low":"低温 4℃","fl":"<![CDATA[3-4级]]>","type":"多云"}
         * city : 上海
         * forecast : [{"date":"3日星期四","high":"高温 10℃","fengli":"<![CDATA[3-4级]]>","low":"低温 7℃","fengxiang":"东北风","type":"多云"},{"date":"4日星期五","high":"高温 10℃","fengli":"<![CDATA[3-4级]]>","low":"低温 8℃","fengxiang":"东风","type":"小雨"},{"date":"5日星期六","high":"高温 9℃","fengli":"<![CDATA[3-4级]]>","low":"低温 7℃","fengxiang":"东北风","type":"小雨"},{"date":"6日星期天","high":"高温 8℃","fengli":"<![CDATA[3-4级]]>","low":"低温 3℃","fengxiang":"北风","type":"多云"},{"date":"7日星期一","high":"高温 10℃","fengli":"<![CDATA[<3级]]>","low":"低温 6℃","fengxiang":"东风","type":"小雨"}]
         * ganmao : 天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。
         * wendu : 8
         */

        private YesterdayBean yesterday;
        private String city;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;
        public YesterdayBean getYesterday()
        {
            return yesterday;
        }
        public void setYesterday(YesterdayBean yesterday)
        {
            this.yesterday = yesterday;
        }
        public String getCity()
        {
            return city;
        }
        public void setCity(String city)
        {
            this.city = city;
        }
        public String getGanmao()
        {
            return ganmao;
        }
        public void setGanmao(String ganmao)
        {
            this.ganmao = ganmao;
        }
        public String getWendu()
        {
            return wendu;
        }
        public void setWendu(String wendu)
        {
            this.wendu = wendu;
        }
        public List<ForecastBean> getForecast()
        {
            return forecast;
        }
        public void setForecast(List<ForecastBean> forecast)
        {
            this.forecast = forecast;
        }
        public static class YesterdayBean
        {
            /**
             * date : 2日星期三
             * high : 高温 7℃
             * fx : 北风
             * low : 低温 4℃
             * fl : <![CDATA[3-4级]]>
             * type : 多云
             */

            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String type;
            public String getDate()
            {
                return date;
            }
            public void setDate(String date)
            {
                this.date = date;
            }
            public String getHigh()
            {
                return high;
            }
            public void setHigh(String high)
            {
                this.high = high;
            }
            public String getFx()
            {
                return fx;
            }
            public void setFx(String fx)
            {
                this.fx = fx;
            }
            public String getLow()
            {
                return low;
            }
            public void setLow(String low)
            {
                this.low = low;
            }
            public String getFl()
            {
                return fl;
            }
            public void setFl(String fl)
            {
                this.fl = fl;
            }
            public String getType()
            {
                return type;
            }
            public void setType(String type)
            {
                this.type = type;
            }
        }



        public static class ForecastBean
        {
            /**
             * date : 3日星期四
             * high : 高温 10℃
             * fengli : <![CDATA[3-4级]]>
             * low : 低温 7℃
             * fengxiang : 东北风
             * type : 多云
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;
            public String getDate()
            {
                return date;
            }
            public void setDate(String date)
            {
                this.date = date;
            }
            public String getHigh()
            {
                return high;
            }
            public void setHigh(String high)
            {
                this.high = high;
            }
            public String getFengli()
            {
                return fengli;
            }
            public void setFengli(String fengli)
            {
                this.fengli = fengli;
            }
            public String getLow()
            {
                return low;
            }
            public void setLow(String low)
            {
                this.low = low;
            }
            public String getFengxiang()
            {
                return fengxiang;
            }
            public void setFengxiang(String fengxiang)
            {
                this.fengxiang = fengxiang;
            }
            public String getType()
            {
                return type;
            }
            public void setType(String type)
            {
                this.type = type;
            }
        }
    }
}
