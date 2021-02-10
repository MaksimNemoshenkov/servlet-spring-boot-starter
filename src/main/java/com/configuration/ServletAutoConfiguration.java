package com.configuration;

import com.servlet.Servlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ServletAutoConfiguration implements WebMvcConfigurer {
    @Bean
    public ServletRegistrationBean getJustServletBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new Servlet(), "/just");
        bean.setLoadOnStartup(1);
        return bean;
    }
}