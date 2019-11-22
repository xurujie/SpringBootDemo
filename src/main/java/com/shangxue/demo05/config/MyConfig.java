package com.shangxue.demo05.config;


import com.shangxue.demo05.component.LoginHandlerInterceptor;
import com.shangxue.demo05.component.MyLocaleResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

//@EnableWebMvc 这个注解可以使得springboot的自动配置失效
@Configuration
public class MyConfig extends WebMvcConfigurationSupport {
    //WebMvcConfigurerAdapter已经过时，推荐WebMvcConfigurationSupport

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);

        //通过访问/hello02 ，来获取hello页面
        registry.addViewController("/hello02").setViewName("hello");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //配置静态资源处理
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/resources/","classpath:/META-INF/resources/", "classpath:/static/","classpath:/resources/static/",
                        "classpath:/public/", "file:///home/data/static","/webjars/**","classpath:/BOOT-INF/classes/static");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // super.addInterceptors(registry);
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/login.html","/user/login","classpath:/resources/","classpath:/META-INF/resources/", "classpath:/static/",
                        "classpath:/public/", "/webjars/**","/123");
    }
}
