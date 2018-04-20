package com.pear.common.web.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * spring容器访问类
 * create by cx is 2018/4/20
 */
@Component
@Lazy(false)
public final class SpringUtils implements ApplicationContextAware, DisposableBean {

    private static final Logger logger = LoggerFactory.getLogger(SpringUtils.class);

    private static ApplicationContext applicationContext;

    private SpringUtils() {
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
    }

    public static <T> T getBean(String name, Class<T> type) {
        return applicationContext.getBean(name, type);
    }

    public static String getMessage(String code, Object... args) {
        Locale locale = LocaleContextHolder.getLocale();
        try {
            return applicationContext.getMessage(code, args, locale);
        } catch (NoSuchMessageException e) {
            logger.warn(e.getMessage());
        }
        return code;
    }



    @Override
    public void destroy() throws Exception {
        applicationContext=null;
    }
}
