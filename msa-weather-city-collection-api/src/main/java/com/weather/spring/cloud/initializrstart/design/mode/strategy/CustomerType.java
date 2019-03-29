package com.weather.spring.cloud.initializrstart.design.mode.strategy;

import lombok.Getter;
import lombok.Setter;

/**
 * @program: msa-weather-master
 * @description: This is strategy mode acount for customer by different prices
 * @author: W.HL
 * @create: 2019-03-27 16:27
 **/

public enum CustomerType
{
    NEW_CUSTOMER(1,"NEW_CUSTOMER"),
    COMMONTYPE_CUSTOMER(1,"COMMON_CUSTOMER"),
    VIP_CUSTOMER(2,"VIP_CUSTOMER"),
    SVIP_CUSTOMER(3,"SVIP_CUSTOMER");

    @Setter @Getter private int code;
    @Setter @Getter private String customerType;

    CustomerType(int code, String customerType)
    {
        this.code = code;
        this.customerType = customerType;
    }

    /**
     * get the customer type
     * @param code
     * @return
     */
    public static String getCustomerType(int code) {
        for (CustomerType ele : values()) {
            if(ele.getCode() == code) {
                return ele.getCustomerType();
            }
        }
        return null;
    }
}
