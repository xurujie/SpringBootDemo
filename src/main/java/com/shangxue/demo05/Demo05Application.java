package com.shangxue.demo05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class Demo05Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo05Application.class, args);
    }

/*
    public static class MyViewResolver implements ViewResolver{
//WebMvcConfigurerAdapter已经过时，推荐WebMvcConfigurationSupport
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
*/

}
