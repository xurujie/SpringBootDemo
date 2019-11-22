package com.shangxue.demo05.component;

import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

//区域信息解析器 实现国际化
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest Request) {
        String l = Request.getParameter("l");

        Locale locale = Locale.getDefault();
       if(l!=null){//检查值是否为空
           String[] s = l.split("_");
           locale = new Locale(s[0],s[1]);
       }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
