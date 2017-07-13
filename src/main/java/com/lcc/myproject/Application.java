package com.lcc.myproject;

import org.glassfish.jersey.jaxb.internal.XmlCollectionJaxbProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by liangchengcheng on 2017/7/13.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(Application.class);
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
    }

}
