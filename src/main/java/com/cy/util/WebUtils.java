package com.cy.util;

import org.apache.commons.beanutils.BeanUtils;
import org.omg.PortableInterceptor.INACTIVE;

import javax.servlet.http.HttpServletRequest;


public class WebUtils {

    public static void copyParamToBean(HttpServletRequest req,Object bean){

        try {
            System.out.println("注入之前："+bean);
            BeanUtils.populate(bean,req.getParameterMap());
            System.out.println("注入之后："+bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 将字符串转化为int类型
     * @param strInt
     * @param defaultValue
     * @return
     */
    public static Integer parseInt(String strInt,int defaultValue){
        try {
            return Integer.parseInt(strInt,defaultValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultValue;
    }
}
