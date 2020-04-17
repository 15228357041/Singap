package com.mingcloud.proxy.util;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author XD
 * @desc 获取bean的工具类，可用于在线程里面获取bean
 * @date 2017-08-24 10:06:21
 * */
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext context = null;

    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
    	SpringContextUtil.context = applicationContext;
    }

    @SuppressWarnings("unchecked")
	public static <T> T getBean(String beanName){
        return (T) context.getBean(beanName);
    }

    public static String getMessage(String key){
        return context.getMessage(key, null, Locale.getDefault());
    }

}