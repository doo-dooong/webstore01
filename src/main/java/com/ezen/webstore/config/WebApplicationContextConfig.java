package com.ezen.webstore.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.*;

@Configuration
@EnableWebMvc
@ComponentScan("com.ezen.webstore")
public class WebApplicationContextConfig extends WebMvcConfigurerAdapter implements WebMvcConfigurer{ // Spring 5

    @Override
    public void configureDefaultServletHandling(
        DefaultServletHandlerConfigurer configurer) {
            configurer.enable();
    }
 
    @Bean
    public InternalResourceViewResolver
            getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = 
            new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");

        return resolver;
    }
}
